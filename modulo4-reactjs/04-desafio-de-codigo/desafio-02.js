// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print para imprimir a saída (output) de dados.
// Abaixo segue um exemplo de código que você pode ou não utilizar


let R = parseInt(3);
let V = 0;

// Complete os espaços em branco com uma possível solução para o problema

while (true) {
    V = parseInt(20)
    if (V > R) {
        break
    }
}

let cont = 0;
let soma = 0;
while (soma <= V) {
    soma += R;
    R++;
    cont++
}
console.log(cont);