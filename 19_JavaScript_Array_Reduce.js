/*

const alunos = [
    {nome: 'fabio', nota: 7.3, bolsista: false},
    {nome: 'pedro', nota: 9.2, bolsista: true},
    {nome: 'laura', nota: 9.8, bolsista: false},
    {nome: 'ana', nota: 8.7, bolsista: true},
]

const resultado = alunos.map(a => a.nota).reduce(function(acumulador,atual){
    console.log(acumulador,atual)
    return acumulador + atual
})

*/

const alunos = [
    {nome: 'fabio', nota: 7.3, bolsista: false},
    {nome: 'pedro', nota: 9.2, bolsista: true},
    {nome: 'laura', nota: 9.8, bolsista: false},
    {nome: 'ana', nota: 8.7, bolsista: true},
]

//desafio 1: todos os alunos são bolsistas?
const todosBolsistas = (resultado,bolsista) =>resultado && bolsista
console.log(alunos.map(a => a.bolsista).reduce(todosBolsistas))

// desafio 2: algum aluno é bolsista?
const algumBolsistas = (resultado,bolsista) =>resultado || bolsista
console.log(alunos.map(a => a.bolsista))
console.log(alunos.map(a => a.bolsista).reduce(algumBolsistas))