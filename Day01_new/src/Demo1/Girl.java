package Demo1;

public class Girl extends Object {
    private String name;
    private int agr;
    private char sex;

    public Girl() {
    }

    public Girl(String name, int agr, char sex) {
        this.name = name;
        this.agr = agr;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgr() {
        return agr;
    }

    public void setAgr(int agr) {
        this.agr = agr;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", agr=" + agr +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Girl girl = (Girl) o;

        if (agr != girl.agr) return false;
        if (sex != girl.sex) return false;
        return name != null ? name.equals(girl.name) : girl.name == null;
    }
}
 class Demo{
     public static void main(String[] args) {
         Girl girl = new Girl("小王",21,'女');
         Girl girl1 = new Girl("小李",21,'女');
         System.out.println(girl.equals(girl1));
         System.out.println(girl);
         System.out.println(girl1);
     }
}
