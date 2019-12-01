package listimpl;

public class ArrayList1<T> implements IList<T> {

    private T[] array;
    private final int incrValue=1;
    private int size=0;

    public ArrayList1() {
        array=(T[]) new Object[incrValue]; // tutaj rzutujemy typ generyczny tabelaryczny na obiekt typu Object (wynika to z tego,
        // ze w Javie nie można tworzyć tablicy typu generycznego)
    }

    public ArrayList1(int startLength) {
        array=(T[]) new Object[startLength];
    }

    @Override
    public boolean isEmpty() {
        return size==0; // można zapisać w taki sposób; od razu porównuje nam wartość i jeśli jest równa to zwraca true, jak nie to false
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T value) {
        if(array.length==size)     // length to wielkosc (rozmiar) tablicy całkowita(niekoniecznie zapełlniona), wynosi np. 6,
            extendTable();                            // size to ilość elementów w tablicy (niekoniecznie całość, reszta może być pusta) i wynosi np. 4
        array[size]=value;
        size++;
    }

    private void extendTable() {    // funkcja dodana, po to aby skrócić kod, używana w dwóch funkcjach typu ,,add"
            T[] tmp=(T[]) new Object[array.length+incrValue];
            for(int i=0; i<array.length; i++)
                tmp[i]=array[i];
            array=tmp;
        }

    private void checkInsertBounds(int index) {  // funkcja stworzona na cele poniższej ,,add(..)", sprawdza index dodawanego elementu
        if(index<0 || index > size)
            throw new IndexOutOfBoundsException();
    }

    private void checkGetBounds(int index) {  // funkcja stworzona na cele poniższej ,,get(..)", sprawdza index dodawanego elementu
        if(index<0 || index > size-1)
            throw new IndexOutOfBoundsException();
    }

    @Override
    public void add(T value, int index) {
        checkInsertBounds(index);
        if(index==size) {
            add(value);
            return;
        }
        if(array.length==size)
            extendTable();
        T[] tmp = (T[]) new Object[array.length];
        for (int i = 0; i < index; i++)
            tmp[i]=array[i];
        tmp[index]=value;
        for(int i=index; i < size; i++)
            tmp[i+1]=array[i];
        array=tmp;
        size++;
    }

    @Override
    public T get(int index) {
        checkGetBounds(index);
        return array[index];
    }

    @Override
    public void set(T value, int index) {
        checkGetBounds(index);
        array[index]=value;
    }

    @Override
    public void remove(int index) {
        checkGetBounds(index);
        T[] tmp = (T[]) new Object[array.length];
        for (int i = 0; i < index; i++)
            tmp[i]=array[i];
        for (int i = index+1; i < size; i++) {
            tmp[i-1]=array[i];
        }
        array=tmp;
        size++;
    }

    @Override
    public void swap(int index1, int index2) {
        checkGetBounds(index1);
        checkGetBounds(index2);
        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
