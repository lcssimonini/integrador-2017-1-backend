$( document ).ready(function() {
  getLogado();
  getProjetos();
  getSprints();
});

function getLogado() {
  $.ajax({
    type: "GET",
    url: "/login",
    success: function(data) {
      $("#usuarioLogado").html(data.login);
    }
  });
}

function getProjetos() {
  $.ajax({
    type: "GET",
    url: "/projetos",
    success: function(data) {
      var options = "";
      for(i in data) {
         options += "<li><a href='#' id='"+data[i].id+"''>"+data[i].nome+"</a></li>";
      }
      $('#listaProjetos').append(options);

      $('#listaProjetos a').click(function(){
        $('#projetoSelecionado').text($(this).text());
        $('#idProjetoSelecionado').text($(this)[0].id);
        getSprints($(this)[0].id);
      });

    }
  });
}

function getSprints(projeto) {
  $('#listaSprints').empty();
  var sprintsUrl = "/sprints"
  if(projeto) {
    sprintsUrl = "/sprints/byProjeto?projeto_id="+projeto
  }

  $.ajax({
    type: "GET",
    url: sprintsUrl,
    success: function(data) {
      var options = "";
      for(i in data) {
         options += "<li><a href='#' id='"+data[i].id+"''>"+data[i].nome+"</a></li>";
      }
      $('#listaSprints').append(options);

      $('#listaSprints a').click(function(){
        $('#idSprintSelecionado').text($(this)[0].id);
        $('#sprintSelecionado').text($(this).text());
        getTarefas();
      });
    }
  });
}

function getTarefas() {
  var sprintId =  $('#idSprintSelecionado').text();

  $('#divPendentes').empty();

  $.ajax({
    type: "GET",
    url: "/tarefas/tarefasSprint?status=PENDENTE&sprint_id="+sprintId,
    success: function(data) {
      var options = "";

      for(i in data) {
        var id = data[i].id;
        var nome = data[i].nome;
        var descricao = data[i].descricao;

         options += "<div class='tarefa' draggable='true' ondragstart='drag(event)' id='"+id+"'> \
                        <label for=''>Titulo</label> \
                        <input type='text' class='form-control' placeholder='Titulo' value='"+nome+"'> \
                        <label for=''>Descrição</label> \
                        <input type='text' class='form-control' placeholder='Descricao' value='"+descricao+"'>\
                      </div>";
      }
      $('#divPendentes').append(options);
    }
  });
}

$('a[rel=popover]').popover({
  html: 'true',
  placement: 'top'
})

function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
    console.log('tarefa mudou de status');
}

function novoCard(){
    var tarefa = {
      nome: $( "#txtTitulo" ).val(),
      descricao: $( "#txtDescription" ).val(),
      sprint: $('#idSprintSelecionado').text()
    };

    $.ajax({
      type: "POST",
      url: "/tarefas",
      data: tarefa,
      success: function(data) {
        console.log(data);
        window.location.href = "/dash.html";
      }
    });
};
