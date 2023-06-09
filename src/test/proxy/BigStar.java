package test.proxy;

public class BigStar implements Star {
    public String name;

    @Override
    public String sing(String name) {
        System.out.println(this.name + "正在唱" + name);
        return "谢谢";
    }

    @Override
    public void dance( ) {
        System.out.println(this.name + "正在跳舞" );
    }

    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BigStar{" +
                "name='" + name + '\'' +
                '}';
    }


}
