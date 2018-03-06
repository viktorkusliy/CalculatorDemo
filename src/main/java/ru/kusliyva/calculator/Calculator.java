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


        public static void main (String args[]){
            final Calculator calculator = new Calculator();
            calculator.division(Double.valueOf(args[0]), Double.valueOf(args[1]));
            System.out.println(calculator.result);


        }

    }
