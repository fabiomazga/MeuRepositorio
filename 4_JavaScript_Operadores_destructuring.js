//destucturing com classe {}
/*
const pessoa = {
    nome:'fabio',
    idade: 39,
    endereco:{
        rua: 'abc',
        numero: 123
    }
}
const { nome, idade } = pessoa
console.log(nome, idade)

const { nome: n, idade: i } = pessoa
console.log(n, i)

const {endereco:{ rua, numero,cep }} = pessoa
console.log(rua, numero,cep)

*/

//destructuring com [] array
/*
const [a] = [10]
console.log(a)

const [n1,,n3,,n5,n6=0] = [1,3,5,6]
console.log(n1,n3,n5,n6)
const [, [,nota]] = [[,1,2],[3,4,5]] //pega o segundo elemento do segundo array
console.log(nota)
*/


//destructuring com funções

 // vou passar um objeto e ao invés de acessar o objeto, que tire do objeto o atributo min e o atributo max

function rand ({min =0, max=1000}){
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}
const obj = {max: 50, min:40} //se não passar algum dos valores ele assume o padrao
console.log(rand(obj))