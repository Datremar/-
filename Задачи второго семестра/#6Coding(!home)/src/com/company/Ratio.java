package com.company;

public class Ratio {

    private int num;
    private int denom;

    private Ratio ratio = this;

    public Ratio(int num, int denom) {
        setNum(num);
        setDenom(denom);

        if (getNum() < 0 && getDenom() < 0) {
            setNum(Math.abs(getNum()));
            setDenom(Math.abs(getDenom()));
        }else if (getDenom() < 0) {
            setDenom(Math.abs(getDenom()));
            setNum(getNum() * -1);

        }

        if (getDenom() != 0) {
            reduce();
        }else {
            System.out.println("Division by zero exception");
        }
    }

    public static void divide(Ratio ratio1, Ratio ratio2) {
        Ratio ratio = new Ratio(ratio1.getNum() * ratio2.getDenom(), ratio1.getDenom() * ratio2.getNum());

        ratio.printRatio();
    }

    public static void multiply(Ratio ratio1, Ratio ratio2) {
        Ratio ratio = new Ratio(ratio1.getNum() * ratio2.getNum(), ratio1.getDenom() * ratio2.getDenom());

        ratio.printRatio();
    }

    public static void summ(Ratio ratio1, Ratio ratio2) {
        Ratio ratio;
        if (ratio1.getDenom() == ratio2.getDenom()) {
            ratio = new Ratio(ratio1.getNum() + ratio2.getNum(), ratio1.getDenom());
        }else {
            ratio = new Ratio(ratio1.getNum() * ratio2.getDenom() + ratio2.getNum() * ratio1.getDenom(), ratio1.getDenom() * ratio2.getDenom());
        }

        ratio.printRatio();
    }

    public static void subtract(Ratio ratio1, Ratio ratio2) {
        Ratio ratio;
        if (!(ratio1.getNum() < 0 || ratio1.getDenom() < 0 && ratio2.getNum() < 0 || ratio2.getDenom() < 0)) {
            if (ratio1.getDenom() == ratio2.getDenom()) {
                ratio = new Ratio(ratio1.getNum() - ratio2.getNum(), ratio1.getDenom());
            } else {
                ratio = new Ratio(ratio1.getNum() * ratio2.getDenom() - ratio2.getNum() * ratio1.getDenom(), ratio1.getDenom() * ratio2.getDenom());
            }
        }else {
            if (ratio1.getDenom() == ratio2.getDenom()) {
                ratio = new Ratio(ratio1.getNum() + ratio2.getNum(), ratio1.getDenom());
            }else {
                ratio = new Ratio(ratio1.getNum() * ratio2.getDenom() + ratio2.getNum() * ratio1.getDenom(), ratio1.getDenom() * ratio2.getDenom());
            }
        }

        ratio.printRatio();
    }

    public static void compare(Ratio ratio1, Ratio ratio2) {
        if (ratio1.getNum() == ratio2.getNum() && ratio1.getDenom() == ratio2.getDenom()) {
            System.out.println("0");
        }else if (ratio1.getNum() / ratio1.getDenom() > ratio2.getNum() / ratio2.getDenom()) {
            System.out.println("1");
        }else if (ratio1.getNum() / ratio1.getDenom() < ratio2.getNum() / ratio2.getDenom()) {
            System.out.println("-1");
        }
    }

    private void reduce() {
        if (isSimple(ratio.getNum()) && isSimple(ratio.getDenom())) {
            ;
        } else if (isSimple(ratio.getNum()) && !isSimple(ratio.getDenom())) {
            if (ratio.getDenom() % ratio.getNum() == 0) {
                ratio.setDenom(ratio.getDenom() / ratio.getNum());
                ratio.setNum(1);
            }
        } else if (!isSimple(ratio.getNum()) && isSimple(ratio.getDenom())) {
            if (ratio.getNum() % ratio.getDenom() == 0) {
                ratio.setNum(ratio.getNum() / ratio.getDenom());
                ratio.setDenom(1);
            }
        } else if (!(isSimple(ratio.getNum()) && isSimple(ratio.getDenom()))) {
            if (getNum() % 2 == 0 && getDenom() % 2 == 0) {
                while (getNum() % 2 == 0 && getDenom() % 2 == 0) {
                    setNum(getNum() / 2);
                    setDenom(getDenom() / 2);
                }
            }
            powerfulReduce();
        }
    }

    private void powerfulReduce() {
        if (getNum() < getDenom()) {
            int k = 0;

            for (int i = 3; i < getNum(); i += 2) {
                if (getNum() % i == 0 && getDenom() % i == 0) {
                    k = i;
                }
            }
            if (k != 0) {
                while (getNum() % k == 0 && getDenom() % k == 0) {
                    setNum(getNum() / k);
                    setDenom(getDenom() / k);
                }
            }
        } else {
            if (!isSimple(ratio.getNum()) && isSimple(ratio.getDenom())) {

                int k = 0;

                for (int i = 3; i < getDenom(); i += 2) {
                    if (getNum() % i == 0 && getDenom() % i == 0) {
                        k = i;
                    }
                }
                if (k != 0) {
                    while (getNum() % k == 0 && getDenom() % k == 0) {
                        setNum(getNum() / k);
                        setDenom(getDenom() / k);
                    }
                }
            }
        }
    }

    private boolean isSimple(int n) {
        boolean result = true;

        if (n % 2 == 0) {
            result = false;
        } else {
            for (int i = 3; i < n; i += 2) {
                if (n % i == 0 && n != i) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public void printRatio() {
        System.out.println(ratio.getNum() + " / " + ratio.getDenom());
    }





    /* SETTERS AND GETTERS*/

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    public int getDenom() {
        return denom;
    }
}
