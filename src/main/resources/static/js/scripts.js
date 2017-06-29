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
}


function aumentar(){
if (document.teste.plus.value.length>100){
		document.teste.plus.cols='50';
		document.teste.plus.rows='10'
}
else return false
}

$('.popover-dismiss').popover({
  trigger: 'focus'
})

function close() {
    document.getElementById("closeranking").style.width = "0%"; 
}

var myLineChart = new Chart(ctx, {
    type: 'line',
    data: data,
    options: options
});
data: [{
        x: 10,
        y: 20
    }, {
        x: 15,
        y: 10
    }]


    Chart(document.getElementById("canvas").getContext("2d")).Bar(line);
