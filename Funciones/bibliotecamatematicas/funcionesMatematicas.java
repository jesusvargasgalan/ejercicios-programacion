/*
    Jesus Vargas 
 */
package funciones;

public class funcionesMatematicas {

  /**
   * Da la vuelta a un n�mero.
   *
   * @param n
   *          un n�mero entero positivo
   * @return n dado la vuelta
   */
  public static int voltea(int n) {
    int volteado = 0;
    while (n > 0) {
      volteado = (volteado * 10) + (n % 10);
      n = n / 10;
    }
    return volteado;
  }

  public static long voltea(long n) {
    return voltea((int) n);
  }

  /**
   * Comprueba si el n�mero es capicua. Un numero es capicua si se lee igual de
   * izquierda a derecha que derecha a izquierda
   * 
   * @param a
   *          un n�mero entero positivo
   * @return True Numero capicuo
   * @return False Numero no capicuo
   */
  public static boolean esCapicua(int n) {
    int copia = n;
    int volteado = 0;
    while (n > 0) {
      volteado = (volteado * 10) + (n % 10);
      n = n / 10;
    }
    if (volteado == copia) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Comprueba si un n�mero entero positivo es primo o no. Un n�mero es primo
   * cuando �nicamente es divisible entre �l mismo y la unidad.
   *
   * @param n
   *          un n�mero entero positivo
   * @return true si el n�mero es primo
   * @return false no es primo
   */
  public static boolean esPrimo(int n) {
    for (int i = 2; i < n; ++i) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Comprueba si un n�mero entero positivo es primo o no. Va aumentando el valor
   * si no es primo hasta encontrar el siguiente primo.
   *
   * @param x
   *          un n�mero entero positivo
   * @return Devuelve el siguiente primo.
   */
  public static int siguientePrimo(int n) {
    boolean esPrimo = false;
    while (esPrimo == false) {
      int j = 2;
      while ((n % j) != 0) {
        ++j;
      }
      if (j == n) {

        esPrimo = true;
      }
      ++n;
    }
    return (n - 1);
  }

  /**
   * Calcula la potencia de un n�mero.
   *
   * @param b,
   *          base.
   * @param e,
   *          exponente.
   * @return Devuelve la potencia.
   */
  public static int potencia(int b, int e) {
    int potencia;
    if (e == 0) {
      potencia = 1;
    } else {
      potencia = b;
      for (int i = 0; i < e - 1; i++) {
        potencia *= b;
      }
    }
    return potencia;

  }

  /**
   * Cuenta el n�mero de d�gitos de un n�mero.
   *
   * @param x
   *          un n�mero entero.
   * @return Devuelve la cantidad de d�gitos.
   */
  public static int digitos(int x) {
    int contador = 0;
    while (x > 0) {
      x /= 10;
      ++contador;
    }
    return contador;
  }

  /**
   * Devuelve el d�gito que est� en la posici�n n de un n�mero entero. Se empieza
   * contando por el 0 y de izquierda a derecha.
   *
   * @param x
   *          un n�mero entero.
   * @param y
   *          Posici�n de la que queremos sacar el d�gito
   * @return Devuelve el d�gito de x en la posici�n y.
   */
  public static int digitoN(int x, int y) {
    int volteado = funciones.funcionesMatematicas.voltea(x);
    int resultado = volteado % 10;

    for (int i = 0; i < y; i++) {
      volteado /= 10;
      resultado = volteado % 10;
    }
    return resultado;
  }

  /**
   * Quita la ultima cifra de la derecha del numero.
   *
   * @param x
   *          un n�mero entero.
   * @param y
   *          Cantidad de n�mero que queremos quitar.
   * @return Devuelve el n�mero con los d�gitos quitados.
   */
  public static int quitaPorDetras(int x, int y) {
    for (int i = 0; i < y; i++) {
      x /= 10;
    }
    return x;
  }

  /**
   * Le quita a un n�mero n d�gitos por detr�s (por la izquierda).
   *
   * @param x
   *          un n�mero entero.
   * @param y
   *          Cantidad de n�mero que queremos quitar.
   * @return Devuelve el n�mero con los d�gitos quitados.
   */
  public static int quitaPorDelante(int x, int y) {
    int volteado = funciones.funcionesMatematicas.voltea(x);
    x = funciones.funcionesMatematicas.quitaPorDetras(volteado, y);
    x = funciones.funcionesMatematicas.voltea(x);
    return x;
  }

  /**
   * A�ade un d�gito por detr�s a un n�mero
   *
   * @param x
   *          un n�mero entero.
   * @param y
   *          D�gito que queremos a�adir.
   * @return Devuelve el n�mero con los d�gitos a�adidos.
   */
  public static int pegaPorDetras(int x, int y) {
    x *= 10;
    int ultimo = x + y;
    return ultimo;
  }

  /**
   * A�ade un d�gito por delante a un n�mero
   *
   * @param x
   *          un n�mero entero.
   * @param y
   *          D�gito que queremos a�adir.
   * @return Devuelve el n�mero con los d�gitos a�adidos.
   */
  public static int pegaPorDelante(int x, int y) {
    int volteado = funciones.funcionesMatematicas.voltea(x);
    x = funciones.funcionesMatematicas.pegaPorDetras(volteado, y);
    x = funciones.funcionesMatematicas.voltea(x);
    return x;
  }

  /**
   * Da la posici�n de la primera ocurrencia de un d�gito dentro de un n�mero
   * entero
   *
   * @param x
   *          un n�mero entero.
   * @param y
   *          D�gito que queremos encontrar
   * @return Devuelve la posici�n del n�mero solicitado
   * @return Devuelve -1 en caso err�neo.
   */
  public static int posicionDeDigito(int x, int y) {
    x = funciones.funcionesMatematicas.voltea(x);
    boolean encontrado = false;
    int resto;
    int contador = 0;
    while ((x > 0) && (encontrado == false)) {
      resto = x % 10;
      if (resto == y) {

        encontrado = true;
      }
      contador++;
      x /= 10;
    }
    contador--;
    if (encontrado == false) {
      return -1;
    } else {
      return contador;
    }
  }

  /**
   * Toma como par�metros las posiciones inicial y final dentro de un n�mero y
   * devuelve el trozo correspondiente.
   *
   * @param x
   *          la posici�n inicial
   * @param y
   *          la posici�n final
   * @param numero
   *          en si.
   * @return Devuelve el trozo conseguido.
   */
  public static int trozoDeNumero(int x, int y, int numero) {
    numero = funciones.funcionesMatematicas.voltea(numero);
    for (int i = 0; i < x; ++i) {
      numero /= 10;
    }
    numero = funciones.funcionesMatematicas.voltea(numero);
    for (int i = 0; i < y; ++i) {
      numero /= 10;
    }
    return numero;
  }

  /**
   * Pega dos n�meros para formar uno.
   *
   * @param x
   *          Primer n�mero
   * @param y
   *          segundo n�mero
   * @return Devuelve el nuevo n�mero juntado.
   */
  public static int juntaNumeros(int x, int y) {
    int longitud = funciones.funcionesMatematicas.digitos(x);
    x *= funciones.funcionesMatematicas.potencia(10, longitud);
    return x + y;
  }
}
