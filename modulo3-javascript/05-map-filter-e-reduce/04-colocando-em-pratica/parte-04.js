function somaNumeros(arr) {
    return arr.reduce(function (prev, current) {
        console.log({ prev });
        console.log({ current });
        return prev + current;
    });
}

const arr = [6, 8];

console.log(somaNumeros(arr));


const lista = [
    {
        name: 'sabao em pó',
        preco: 30,
    },
    {
        name: 'cereal',
        preco: 12,
    },
    {
        name: 'toalha',
        preco: 30,
    }
]

const saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista) {
    return lista.reduce(function (prev, current, index) {
        console.log('Rodada: ', index + 1);
        console.log({ prev });
        console.log({ current });
        return prev - current.preco
    }, saldoDisponivel)
}

console.log(calculaSaldo(saldoDisponivel, lista));
