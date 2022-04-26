// Atividade prática //

// Atividade 2: Sets
// Dado o Array, retorne outro Array apenas com valores únicos.

const meuArray = [30, 30, 40, 40, 5, 223, 2049, 4044, 5, 30];

function valorUnico(arr) {
    const mySet = new Set(arr)
    return [...mySet];
}

console.log(valorUnico(meuArray));
