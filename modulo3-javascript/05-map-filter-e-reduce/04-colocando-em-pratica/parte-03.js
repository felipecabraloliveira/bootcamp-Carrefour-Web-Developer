function filterPares(arr) {
    return arr.filter(callback);
}

function callback(item) {
    return item % 2 === 0;
}

const meuArray = [1, 23, 55, 67, 30, 2, 4];

console.log(filterPares(meuArray));

// Incrementando o código.

function filterNumeros(arr, tipo) {
    if (tipo === 'par') {
        return arr.filter(par);
    } else {
        return arr.filter(impar);
    }
}

function par(item) {
    return item % 2 === 0;
}

function impar(item) {
    return item % 2 !== 0;
}

const myArray = [1, 23, 55, 67, 30, 2, 4];

console.log('Números Pares: ' + filterNumeros(myArray, 'par'));
console.log('Números Ímpares: ' + filterNumeros(myArray, 'impar'));
