/*function Pessoa(){
   this.idade = 0;
   setInterval(() => {
    this.idade++;
    console.log(this.idade);
   }, 1000)

}
new Pessoa
*/
let comparaComThis = function (param){
   console.log(this === param) // sem arrow aponta pro global
}
comparaComThis(global)
const obj = {}
comparaComThis (global)
comparaComThis(obj)

let comparaComThisArrow = param => console.log(this === param) // com arrow o this não aponta pro global
comparaComThisArrow = comparaComThisArrow.bind(obj)
comparaComThisArrow(obj)
comparaComThisArrow(module.exports)

