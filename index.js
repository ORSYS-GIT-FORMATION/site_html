let div=document.createElement("div");
div.setAttribute("id","textAcceuil")
let text= document.createElement("p");
text.textContent=`toto`;
div.appendChild(text);
let main= document.getElementById("main");
main.appendChild(div);