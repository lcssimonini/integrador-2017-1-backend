const context = document.getElementById("canvas").getContext("2d")

var data = {
  fill: false,
  labels: ["Sprint 1", "Sprint 2", "Sprint 3", "Sprint 4", "Sprint 5"],
  datasets: [{
  label: "Sprint",
  backgroundColor: '#F5E461',
  borderColor: '#F5E461',
  data: [
    1,
    2,
    3,
    5,
    4,
  ]
  }]
}

var options = {
   responsive: true
}

var myLineChart = new Chart(context, {
    type: 'line',
    data: data,
    options: options
});
