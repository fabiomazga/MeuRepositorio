/*
const produtos = [
{nome:'notebook', preco: 2000, fragil: true},
{nome:'celular', preco: 1000, fragil: true},
{nome:'copo', preco: 20, fragil: true},
{nome:'caneta', preco: 3, fragil: false},

]
console.log(produtos.filter(function(p){
    return p.preco>1000
}))
const caro = produto => produto.preco>=500
const fragil = produto => produto.fragil

console.log(produtos.filter(caro).filter(fragil))

*/

Array.prototype.filter2 = function(callback){
    const newArray= []// gerar um arry que contenha apenas os elementos selecionados
      for (let i = 0; this.length; i++){
        if(callback(this[i],i,this){
            
        })

      }
}

const produtos = [
    {nome:'notebook', preco: 2000, fragil: true},
    {nome:'celular', preco: 1000, fragil: true},
    {nome:'copo', preco: 20, fragil: true},
    {nome:'caneta', preco: 3, fragil: false},
    
    ]
  
    const caro = produto => produto.preco>=500
    const fragil = produto => produto.fragil
    
    console.log(produtos.filter2(caro).filter2(fragil))