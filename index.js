let div=document.createElement("div");
div.setAttribute("id","textAcceuil")
let text= document.createElement("p");
text.textContent=`toto`;
div.appendChild(text);
let main= document.getElementById("main");
main.appendChild(div);

var today = new Date();
var hourNow = today.getHours();
var greetings;

if (hourNow < 12) {
    greetings = "Good Morning!";
}
else if (hourNow < 20) {
    greetings = "Good Afternoon!";
}
else if (hourNow < 24) {
    greetings = "Good evening!";
}
else {
    greetings = "Welcome!";
}

document.getElementById("col-1").innerHTML = "<h3>" + greetings + "</h3>";

document.getElementById("button-del").onclick = function(){
    document.getElementById('top-section').innerHTML = "";
}