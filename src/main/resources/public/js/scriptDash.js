$( document ).ready(function() {
  getLogado();
});

function getLogado() {
  $.ajax({
    type: "GET",
    url: "/login",
    success: function(data) {
      console.log(data);
      $("#usuarioLogado").html(data.login);
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


function toogle_disabled( bool ) {
	var input = document.getElementsByTagName('input');
	var textarea = document.getElementsByTagName('textarea');
	for( var i=0; i<=(input.length-1); i++ )
	{
		if( input[i].type!='image' )
			input[i].disabled = bool;
	}
	for( var i=0; i<=(textarea.length-1); i++ )
	{
		textarea[i].disabled = bool;
	}
  console.log('salvando');
}

function novoCard(){
  var novocard = "<div draggable='true' ondragstart='drag(event)' id='drag1'><label for=''>Titulo</label><input type='image' src='img/pencil-edit-button.svg'  width='15px' height='15px' onclick='toogle_disabled( false )'><input type='image' src='img/save-file-option.svg'  width='15px' height='15px' onclick='toogle_disabled( true )'><input type='text' class='form-control' placeholder='Descreva o Titulo'><label for=''>Descrição</label><textarea type='text' class='form-control' rows='3' cols='30' id='plus' name='teste' placeholder='Descreva aqui a tarefa'></textarea></div>";
        document.getElementById("div1").innerHTML = novocard;
};
