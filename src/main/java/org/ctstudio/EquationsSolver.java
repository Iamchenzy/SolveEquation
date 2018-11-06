package org.ctstudio;

/**
 * 二元一次方程组解题器，能解以下形式的二元一次方程组：
 * a1*x+b1*y+c1=0
 * a2*x+b2*y+c2=0
 * 解题要求请参考README.md
 */
public class EquationsSolver {

  private double x;
  private double y;
  private boolean flag = true;  //方程组无解的标志位：true为有解，false无解

    //消元法
  public EquationsSolver(double a1, double b1, double c1, double a2, double b2, double c2) {
    if( a1 * b2 == a2 * b1){
        flag = false;
    }else{
      this.x = (c2*b1 - c1*b2)/(a1*b2-a2*b1);
      this.y = (c2*a1 - c1*a2)/(a2*b1-a1*b2);
    }
  }

  public Double getX() {
      if(!this.flag){
          return null;
      }
      return x;
  }

  public Double getY() {
      if(!this.flag){
          return null;
      }
      return y;

  }
}
