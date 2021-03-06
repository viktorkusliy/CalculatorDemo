package ru.kusliyva.calculator;

    public class Calculator implements ICalculator {

        private double result;

        public final double getResult(){
            return this.result;
        }

        public final void addition (final double first, final double second){
            this.result = first + second;
        }

        public final void subtraction (final double first, final double second){
            this.result = first - second;
        }

        public final void multiplication (final double first, final double second){
            this.result = first * second;
        }

        public final void division (final double first, final double second){
            if (second != 0d){
                this.result = first / second;
            }
            else {
                throw new ArithmeticException ("Division by zero is not permissible");
            }
        }

        @Override
        public final void exponentiation(final double first, final double second) {
            double result = first;
            for (int i = 1; i != second; i++){
                result *= first;
            }
            this.result = result;
        }

        public void calculate(String operation, double first, double second){
            if("+".equals(operation)){
                this.addition(first, second);
            }
            else if("-".equals(operation)){
                this.subtraction(first, second);
            }
            else if("*".equals(operation)){
                this.multiplication(first, second);
            }
            else if("/".equals(operation)){
                this.division(first, second);
            }
            else if("^".equals(operation)){
                this.exponentiation(first, second);
            }
            else{
                throw new UnsupportedOperationException();
            }

        }

    }
