$( document ).ready(function() {
    $( "#loginBtn" ).click(function() {
      var usuario = $( "#inputEmail" ).val();
      var senha = $( "#inputPassword" ).val();
      login(usuario, senha);
    });
});

function login(usuario, senha) {
  console.log(usuario, senha);

  $.ajax({
    type: "POST",
    url: "/login?usuario="+usuario+"&senha="+senha,
    success: function(data) {
      console.log(data);
      window.location.href = "/dash.html";
    }
  });
}
