// Desafio 01 do Desafios Iniciais Js - Carrefour Web

const a = parseInt(7);
const b = parseInt(3);

q = parseInt(a / b);

r = a - b * q;

if (r < 0) {
    r += Math.abs(b);

    q = (a - r) / b;    //escreva sua lógica aqui
}

console.log(q + " " + r);