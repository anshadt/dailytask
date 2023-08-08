function bclick(cal){
    document.getElementById("Screen").value+=cal;
}
function clr(){
    document.getElementById("Screen").value="";
}
function eclick(){
    var equal= document.getElementById("Screen").value
    var result= eval(equal);
    document.getElementById("Screen").value=result
}