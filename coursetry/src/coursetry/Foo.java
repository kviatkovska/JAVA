package coursetry;

class Bar {}

public class Foo<K>
{
    final private int count;
    final private K key;

    Foo(Builder<K> b)
    {
        this.count = b.count;
        this.key = b.key;
    }

    public static class Builder<K2>
    {
        int count;
        K2 key;

        private Builder() {}
        static public <K3> Builder<K3> start() { return new Builder<K3>(); }
        public Builder<K2> setCount(int count) { this.count = count; return this; }
        public Builder<K2> setKey(K2 key) { this.key = key; return this; }
        public Foo<K2> build() { return new Foo(this); }
    }

    public static void main(String[] args)
    {
        Bar bar = new Bar();
        Foo<Bar> foo1 = Foo.Builder.<Bar> start().setCount(1).setKey(bar).build();;
        // Type mismatch: cannot convert from Foo<Object> to Foo<Bar>

        Foo<Bar> foo2 = Foo.Builder.<Bar> start().setCount(1).setKey(bar).build();;
        // Multiple markers at this line
        // - Bar cannot be resolved
        // - Foo.Builder cannot be resolved
        // - Syntax error on token ".", delete this token
        // - The method start() is undefined for the type Foo<K>
        // - Duplicate local variable fooType mismatch: cannot convert from Foo<Object> to Foo<Bar>

        Foo<Bar> foo3 = Foo.Builder.<Bar> start().setCount(1).setKey(bar).build();;
        // Multiple markers at this line
        // - Foo cannot be resolved
        // - Syntax error on token ".", delete this token
        // - Bar cannot be resolved     
    }
}