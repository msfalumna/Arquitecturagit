// Ampliando el uso de var let y const
/*
con var puedes reasignar en cualquier momento, 
esta forma parte del ambito global un error es que se sobreescriba*/
var nombre = "sole";
nombre = "Osvaldo";
console.log(nombre);
function saludar(){
    var nombre3 = "Natalia";
    console.log(nombre3);
}
//console.log(nombre3);
if(true){
    var edad = 34;
    console.log(edad);34
}
console.log(edad);// en la funcion funciuona correctamente en la estructura if fallo 

/* let: esta puede ser reasignado en cualquier momento la diferencia es que su ambito es de bloque, solo disponible dentro
de un bloque de llaves o dentro de una funcion*/
function saludar2(){
    let nombre2 = "sole";
    console.log(nombre2);
    if(true){
        let edad2 = 33;
        console.log(edad2);
    }
}
/*Const se utiliza para valores constantes que no pueden ser reasignados*/
const fechaNacimiento = 2006;
console.log(fechaNacimiento);
fechaNacimiento = 2003;
console.log(fechaNacimiento); // solo se ejecuta el console anterior

//evitar repetir tu codigo
//Dry don t repeat yourself
let days = "sabado";

