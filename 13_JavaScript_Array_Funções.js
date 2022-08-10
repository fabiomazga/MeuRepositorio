const pilotos = ['fabio', 'pedro', 'laura','daniel']
pilotos.pop() //remove o último elemento
console.log(pilotos)
pilotos.push('fernanda') // adiciona na última posição
console.log(pilotos)
pilotos.shift() //remove o primeiro elemento
console.log(pilotos)
pilotos.unshift('mauro') // adiciona na primeira posição
console.log(pilotos)
pilotos.splice(2,0,'eliana') // adiciona eliana no indice 2
console.log(pilotos)
console.log(pilotos[2])
console.log(pilotos[3])
pilotos.splice(3,1) // remove 1 elemento do índice 3
console.log(pilotos)
const algunsPilotos1 = pilotos.slice(2) //gera um novo array do indice 2 até o final
console.log(algunsPilotos1)
const algunsPilotos2 = pilotos.slice(1,4)
console.log(algunsPilotos2)