const carrinho = [
    '{"nome":"lapis","preco": 1.20}',
    '{"nome":"borracha","preco": 2.30}',
    '{"nome":"caneta","preco": 3.40}',
]

const paraObjeto = json => JSON.parse(json)
const apenasPreco = produto =>produto.preco
const resultado = carrinho.map(paraObjeto).map(apenasPreco)
console.log(resultado)