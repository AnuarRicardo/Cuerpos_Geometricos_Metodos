import java.util.Scanner;

public class App {
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcion;

        do {
            opcion = mostarmenu();
            evaluaropcion(opcion);
        } while (opcion != 17);
    }

    public static int mostarmenu() {
        System.out.println("1) calcular prisma");
        System.out.println("2) calcular cilindro");
        System.out.println("3) calcular piramide");
        System.out.println("4) calcular cono");
        System.out.println("5) calcular esfera");
        System.out.println("6) calcular Tronco cono");
        System.out.println("7) calcular Tronco piramide");
        System.out.println("8) calcular (Huso esferico/Cuña esferica)");
        System.out.println("9) calcular Tetradeo");
        System.out.println("10) calcular Hexaedro");
        System.out.println("11) calcular Octaedro");
        System.out.println("12) calcular Dodecaedro");
        System.out.println("13) calcular Isoedro");
        System.out.println("14) calcular ortoedro");
        System.out.println("15) salir del programa");
        System.out.print("Seleccione una opción: ");
        int opc = lector.nextInt();
        return opc;
    }

    public static void evaluaropcion(int opc) {
        switch (opc) {
            case 1:
                prisma();
                break;
            case 2:
                cilindro();
                break;
                case 3:
                piramide();
                break;
                case 4:
                cono();
                break;
                case 5:
                esfera();
                break;
                case 6:
                troncoCono();
                break;
                case 7:
                TroncoPiramide();
                break;
                case 8:
                husoesferico();
                break;
                case 9:
                tetradeo();
                break;
                case 10:
                Hexaedro();
                break;
                case 11:
                Octaedro();
                break;
                case 12:
                Dodecaedro();
                break;
                case 13:
                Isoedro();
                break;
                case 14:
                Ortoedro();
                break;
                case 15:
                salirdelprograma();
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción válida.");
        }
    }

    public static void prisma() {
        int cantidadLados;
        double longitudLados, altura, areaLateral, areaTotal, volumen;
        double perimetroBase, areaBase, apotema;
        int intentos = 0;
    
        do {
            if (intentos > 0) {
                System.out.println(". Intentos restantes: " + (3 - intentos));
            }
    
            System.out.print("Cantidad de lados: ");
            cantidadLados = lector.nextInt();
            intentos++;
            if (intentos >= 3) {
                System.out.println("Se han agotado los intentos.");
                return;
            }
        } while (cantidadLados <= 0);
    
        intentos = 0;
        do {
            if (intentos > 0) {
                System.out.println("Entrada no válida. Intentos restantes: " + (3 - intentos));
            }
    
            System.out.print("Altura: ");
            altura = lector.nextDouble();
            intentos++;
            if (intentos >= 3) {
                System.out.println("Se han agotado los intentos.");
                return;
            }
        } while (altura <= 0);
    
        intentos = 0;
        do {
            if (intentos > 0) {
                System.out.println("Entrada no válida. Intentos restantes: " + (3 - intentos));
            }
    
            System.out.print("Longitud de los lados: ");
            longitudLados = lector.nextDouble();
            intentos++;
            if (intentos >= 3) {
                System.out.println("Se han agotado los intentos.");
                return;
            }
        } while (longitudLados <= 0);
    
        perimetroBase = cantidadLados * longitudLados;
        areaLateral = perimetroBase * altura;
        double alfa = (Math.PI / 180) * (360 / cantidadLados);
        apotema = longitudLados / (2 * Math.tan((alfa) / 2));
        areaBase = (perimetroBase * apotema) / 2;
        areaTotal = areaLateral + 2 * areaBase;
        volumen = areaBase * altura;
    
        System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cúbicas.");
    }
    public static void cilindro() {
        double altura = 0.0; 
        double radio = 0.0;
        double areaLateral, areaTotal, volumen, perimetroBase, base;
        int intentos = 0;
    
        while (intentos < 3) {
            System.out.print("Digite el radio: ");
            radio = lector.nextDouble();
            if (radio > 0) {
                break;
            }
            System.out.println("No puede ser cero.");
            intentos++;
        }
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
        intentos = 0;
        while (intentos < 3) {
            System.out.print("Digite la altura: ");
            altura = lector.nextDouble();
            if (altura > 0) {
                break;
            }
            System.out.println("no puede ser cero");
            intentos++;
        }
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
        perimetroBase = 2 * Math.PI * radio;
        areaLateral = perimetroBase * altura;
        base = Math.PI * (radio * radio);
        areaTotal = areaLateral + 2 * base;
        volumen = base * altura;
    
        System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cúbicas.");
    }
    public static void piramide() {
        int cantidadLados = 0;
        double altura = 0;
        double apotemaB = 0;
        double perimetroBase= 0;
        double apotemapiramide= 0;
        double longitud=0;
        double arealateral, areatotal, volumen;
        double areabasemayor;
        int intentos = 0;
    
        while (intentos < 3) {
            System.out.print("Cantidad de lados: ");
            cantidadLados = lector.nextInt();
            if (cantidadLados > 0) {
                break;
            }
            System.out.println("no puede ser cero");
            intentos++;
        }
    
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
    
        intentos = 0;
    
        while (intentos < 3) {
            System.out.print("Altura: ");
            altura = lector.nextDouble();
            if (altura > 0) {
                break;
            }
            System.out.println("no puede ser cero");
            intentos++;
        }
    
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }

        double alfa = (Math.PI / 180) * (360 / cantidadLados);
        perimetroBase = cantidadLados * longitud;
        apotemaB = longitud / (2 * Math.tan(alfa / 2));
        apotemapiramide = altura + apotemaB;
        arealateral = perimetroBase * apotemapiramide;
        areabasemayor = (perimetroBase * apotemaB) / 2;
        areatotal = arealateral + areabasemayor;
        volumen = (areabasemayor * altura) / 3;
        System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
        System.out.println("Area total: " + areatotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cúbicas.");
    }
    public static void cono() {
        int cantidadLados = 0;
        double altura = 0;
        double perimetroBase=0;
        double generatriz=0;
        double areabase=0;
        double longitud=0;
        double radio=0;
        double arealateral, areatotal, volumen;
        int intentos = 0;
    
        while (intentos < 3) {
            System.out.print("Cantidad de lados: ");
            cantidadLados = lector.nextInt();
            if (cantidadLados > 0) {
                break;
            }
            System.out.println("Entrada no válida.");
            intentos++;
        }
    
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
    
        intentos = 0;
    
        while (intentos < 3) {
            System.out.print("Altura: ");
            altura = lector.nextDouble();
            if (altura > 0) {
                break;
            }
            System.out.println("En.");
            intentos++;
        }
    
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
    
        intentos = 0;

        while (intentos < 3) {
            System.out.print("Radio: ");
            radio = lector.nextDouble();
            if (radio > 0) {
                break;
            }
            System.out.println("Entrada no válida.");
            intentos++;
        }
    
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
        perimetroBase = cantidadLados * longitud;
        generatriz = altura + radio;
        arealateral = (perimetroBase * generatriz) / 2;
        areabase = Math.PI * Math.pow(radio, 2);
        areatotal = arealateral + areabase;
        volumen = (areabase * altura) / 3;
        System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
        System.out.println("Area total: " + areatotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cúbicas.");
    }
    public static void esfera() {
        double radio = 0.0;
        double area, volumen;
        int intentos = 0;
        while (intentos < 3) {
            System.out.print("Digite el radio: ");
            radio = lector.nextDouble();
            if (radio > 0) {
                break;
            }
            System.out.println("Entrada no válida.");
            intentos++;
        }
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
        area = 4 * Math.PI * Math.pow(radio, 2);
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("Área: " + area + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cúbicas.");
    }
    public static void troncoCono() {
        double radio = 0;
        double radiomayor = 0;
        double longitud=0;
        double altura = 0;
        double volumen=0;
        double generatriz, arealateral;
        double areabasemayor, areabasemenor;
        double areatotal, apotemabase;
        int cantidadlados = 0;
        int intentos = 0;
        while (intentos < 3) {
            System.out.print("Cantidad de lados: ");
            cantidadlados = lector.nextInt();
            if (cantidadlados > 0) {
                break;
            }
            System.out.println("Entrada no válida.");
            intentos++;
        }
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
        intentos = 0;
        while (intentos < 3) {
            System.out.print("Altura: ");
            altura = lector.nextDouble();
            if (altura > 0) {
                break;
            }
            System.out.println("Entrada no válida.");
            intentos++;
        }
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
        intentos = 0;
        while (intentos < 3) {
            System.out.print("Longitud de los lados: ");
            longitud = lector.nextDouble();
            if (longitud > 0) {
                break;
            }
            System.out.println("Entrada no válida.");
            intentos++;
        }
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
        intentos = 0;
        while (intentos < 3) {
            System.out.print("Radio: ");
            radio = lector.nextDouble();
            if (radio > 0) {
                break;
            }
            System.out.println("Entrada no válida.");
            intentos++;
        }
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
        intentos = 0;
        while (intentos < 3) {
            System.out.print("Radio Mayor: ");
            radiomayor = lector.nextDouble();
            if (radiomayor > 0) {
                break;
            }
            System.out.println("Entrada no válida.");
            intentos++;
        }
        if (intentos >= 3) {
            System.out.println("Se han agotado los intentos.");
            return;
        }
        double alfa = (Math.PI / 180) * (360 / cantidadlados);
        apotemabase = longitud / (2 * Math.tan(alfa / 2));
        generatriz = Math.pow(altura, 2) * Math.pow(radio, 2);
        arealateral = Math.PI * generatriz * (radiomayor + radio);
        areabasemayor = Math.PI * Math.pow(radiomayor, 2);
        areabasemenor = Math.PI * Math.pow(radio, 2);
        areatotal = arealateral + areabasemayor + areabasemenor;
        volumen = (1.0 / 3.0) * Math.PI * altura * (Math.pow(radiomayor, 2) + radiomayor * radio + Math.pow(radio, 2));
        System.out.println("Área lateral: " + arealateral + " unidades cuadradas.");
        System.out.println("Área total: " + areatotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cúbicas.");
    }
    public static void TroncoPiramide(  ) {
        int altura=0;
        int cantidadlados=0;
        double longitud=0;
        double radio=0;
        double radiomayor=0;

        double apotemapiramide, arealateral, areatotal, volumen, apotemabase;
        double areabasemayor, areabasemenor,perimetrobasemayor, perimetrobasemenor;
        int intentos = 3;
        while (intentos > 0) {
            System.out.println("Intentos restantes: " + intentos);
            System.out.println("Digite la altura: ");
            altura = lector.nextInt();
            if (altura <= 0) {
                System.out.println("La altura no puede ser cero ni negativa");
                intentos--;
                continue;
            }
            System.out.println("Digite la longitud: ");
            longitud = lector.nextDouble();
            if (longitud <= 0) {
                System.out.println("La longitud no puede ser cero ni negativa");
                intentos--;
                continue;
            }
            System.out.println("Digite la cantidad de lados");
            cantidadlados = lector.nextInt();
            if (cantidadlados <= 0) {
                System.out.println("La cantidad de lados no puede ser cero");
                intentos--;
                continue;
            }
            System.out.println("Digite la radio mayor: ");
            radiomayor = lector.nextDouble();
            if (radiomayor <= 0) {
                System.out.println("El radio mayor no puede ser cero ni negativo");
                intentos--;
                continue;
            }
            System.out.println("Digite el radio: ");
            radio = lector.nextDouble();
            if (radio <= 0) {
                System.out.println("El radio no puede ser cero ni negativo");
                intentos--;
                continue;
            }
            break;
        }
        double alfa = (Math.PI / 180) * (360 / cantidadlados);
        apotemabase = longitud / (2 * Math.tan(alfa / 2));
        apotemapiramide = Math.pow(altura, 2) + (Math.pow(apotemabase, 2));
        perimetrobasemayor = cantidadlados * longitud;
        perimetrobasemenor = 2 * Math.PI * radio;
        arealateral = (perimetrobasemayor + perimetrobasemenor) / 2 * apotemapiramide;
        areabasemayor = Math.PI * Math.pow(radiomayor, 2);
        areabasemenor = Math.PI * Math.pow(radio, 2);
        areatotal = arealateral + areabasemayor + areabasemenor;
        volumen = (1 / 3) * altura * (areabasemayor + areabasemenor + Math.sqrt(areabasemayor * areabasemenor));
        System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
        System.out.println("Area total: " + areatotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cúbicas.");
    }
    public static void husoesferico() {
        int intentosRestantes=0;
        if (intentosRestantes <= 0) {
            System.out.println("Agotaste tus 3 intentos. El programa ha terminado.");
            return;
        }

        int radio;
        double area, volumen, numero;

        System.out.println("Intentos restantes: " + intentosRestantes);
        System.out.println("Digite el radio: ");
        radio = lector.nextInt();
        if (radio <= 0) {
            System.out.println("El radio no puede ser cero ni negativo");
            return;
        }

        System.out.println("Digite el número de grados: ");
        numero = lector.nextInt();
        if (numero <= 0) {
            System.out.println("El número de grados no puede ser cero");
            return;
        }
        area = (4 * Math.PI * radio * radio * numero) / 360;
        volumen = (4.0 / 3) * (Math.PI * Math.pow(radio, 3) * numero) / 360;
        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
    }
    public static void tetradeo() {
        int intentosRestantes = 3;

        while (intentosRestantes > 0) {
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Digite la base: ");
            int areabase = lector.nextInt();

            if (areabase <= 0) {
                System.out.println("La base no puede ser cero ni negativa");
                intentosRestantes--;
            } else {
                double area = Math.pow(areabase, 2) * Math.sqrt(3);
                double volumen = (Math.sqrt(2)) / 12 * Math.pow(areabase, 3);
                System.out.println("Área: " + area);
                System.out.println("Volumen: " + volumen);
                break;
            }
        }

        if (intentosRestantes == 0) {
            System.out.println("Agotaste tus 3 intentos. El programa ha terminado.");
        }
    }
public static void Hexaedro() {
    int intentosRestantes = 3;

    while (intentosRestantes > 0) {
        System.out.println("Intentos restantes: " + intentosRestantes);
        System.out.print("Digite la base: ");
        int areabase = lector.nextInt();

        if (areabase <= 0) {
            System.out.println("La base no puede ser cero ni negativa");
            intentosRestantes--;
        } else {
            double area = 6 * Math.pow(areabase, 2);
            double volumen = Math.pow(areabase, 3);
            System.out.println("Área: " + area);
            System.out.println("Volumen: " + volumen);
            break;
    }

    if (intentosRestantes == 0) {
        System.out.println("Agotaste tus 3 intentos. El programa ha terminado.");
    }
    }
}

    public static void Octaedro() {
        int intentosRestantes = 3;
        while (intentosRestantes > 0) {
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Digite la base: ");
            int areabase = lector.nextInt();
            if (areabase <= 0) {
                System.out.println("La base no puede ser cero ni negativa");
                intentosRestantes--;
            } else {
                double area = 2 * Math.pow(areabase, 2) * Math.sqrt(3);
                double volumen = (Math.sqrt(2)) / 3 * Math.pow(areabase, 3);
                System.out.println("Área: " + area);
                System.out.println("Volumen: " + volumen);
                break;
            }
        }
        if (intentosRestantes == 0) {
            System.out.println("Agotaste tus 3 intentos. El programa ha terminado.");
        }
    }
    public static void Dodecaedro() {
        int intentosRestantes = 3;
        while (intentosRestantes > 0) {
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Digite la base: ");
            int areabase = lector.nextInt();
            if (areabase <= 0) {
                System.out.println("La base no puede ser cero ni negativa");
                intentosRestantes--;
            } else {
                double area = 3 * Math.pow(areabase, 2) * Math.sqrt(25 + 10) * Math.sqrt(5);
                double volumen = (1.0 / 4) * (15 + 7 * Math.sqrt(5)) * Math.pow(areabase, 3);
                System.out.println("Área: " + area);
                System.out.println("Volumen: " + volumen);
                break;
            }
        }
        if (intentosRestantes == 0) {
            System.out.println("Agotaste tus 3 intentos. El programa ha terminado.");
        }
    }
    public static void Isoedro() {
        int intentosRestantes = 3;
        while (intentosRestantes > 0) {
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Digite la base: ");
            int areabase = lector.nextInt();
            if (areabase <= 0) {
                System.out.println("La base no puede ser cero ni negativa");
                intentosRestantes--;
            } else {
                double area = 5 * Math.pow(areabase, 2) * Math.sqrt(3);
                double volumen = (5.0 / 12) * (3 + Math.sqrt(15)) * Math.pow(areabase, 3);
                System.out.println("Área: " + area);
                System.out.println("Volumen: " + volumen);
                break;
            }
        }
        if (intentosRestantes == 0) {
            System.out.println("Agotaste tus 3 intentos. El programa ha terminado.");
        }
    }
    public static void Ortoedro() {
        int intentosRestantes = 3;
        while (intentosRestantes > 0) {
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Digite la altura: ");
            double altura = lector.nextDouble();
            if (altura <= 0) {
                System.out.println("La altura no puede ser cero ni negativa");
                intentosRestantes--;
            } else {
                System.out.print("Digite la longitud: ");
                double longitud = lector.nextDouble();
                if (longitud <= 0) {
                    System.out.println("La longitud no puede ser cero ni negativa");
                    intentosRestantes--;
                } else {
                    System.out.print("Digite la profundidad: ");
                    double profundidad = lector.nextDouble();
                    if (profundidad <= 0) {
                        System.out.println("La profundidad no puede ser cero ni negativa");
                        intentosRestantes--;
                    } else {
                        double area = 2 * (altura * longitud + altura * profundidad + longitud * profundidad);
                        double diagonal = Math.sqrt(altura * altura + longitud * longitud + profundidad * profundidad);
                        double volumen = altura * longitud * profundidad;
                        System.out.println("Área: " + area);
                        System.out.println("Volumen: " + volumen);
                        System.out.println("Diagonal: " + diagonal);
                        break;
                    }
                }
            }
        }
        if (intentosRestantes == 0) {
            System.out.println("Agotaste tus 3 intentos. El programa ha terminado.");
        }
    }
    public static void salirdelprograma() {
        System.out.println("¡Adiós!");
        System.exit(0);
    }
}
