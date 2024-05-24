let x=function(e){
    console.log(e)
    alert("Hello World1:");
}
let y=function(e){
    console.log(e);
    alert("Hello World");
}
btn.addEventlistener('Click', x);
btn.addEventlistener('Click', y);
let a=prompt("WHat is your favourite no.???")
if(a==2){
btn.nameEventlistener('click', x)

}
// btn.addEventlistener('click', function(e){
//     alert("Hello World!2")

// })
// btn.addEventlistener('click', function(e){
//     alert("Hello World!35443545")

// })