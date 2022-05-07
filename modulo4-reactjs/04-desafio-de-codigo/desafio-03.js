// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

let totalItems = parseInt(gets());
let pares = [];
let impares = [];


for (let i = 0; i < totalItems; i++) {
    let number = parseInt(gets());
    if (number % 2 === 0) {
        pares.push(number);
    }
    else {
        impares.push(number);
    }
}
pares.sort((a, b) => a - b);
impares.sort((a, b) => b - a);

for (let i = 0; i < pares.length; i++) {
    print(pares[i]);
}
for (let i = 0; i < impares.length; i++) {
    print(impares[i]);
}