public interface CarList {

    Car get(int index);

    public void add(Car car);

    boolean remove(Car car);

    boolean removeAt(int index);

    int size();

    public void clear();

}
