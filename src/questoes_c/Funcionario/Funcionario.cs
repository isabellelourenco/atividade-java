using System;

namespace Atividade {

    public class Funcionario {

        private String nome;
        private double salario;
        private double salarioMedio;

        public double calcularMedia(double primeiroSalario, double segundoSalario) {

            salarioMedio = (primeiroSalario + segundoSalario) / 2;

            return salarioMedio;
        }

        public double GetNome() {
            return this.nome;
        }

        public void SetNome(String nome) {
            this.nome = nome;
        }

        public double GetSalario() {
            return this.salario;
        }

        public void SetSalario(double salario) {
            this.salario = salario;
        }

        public double GetSalarioMedio() {
            return this.salarioMedio;
        }

        public void SetSalarioMedio(double salarioMedio) {
            this.salarioMedio = salarioMedio;
        }

    }



 }