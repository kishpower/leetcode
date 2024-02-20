package InsertDeleteGetRandomO1380;

import java.util.*;

public class RandomizedSet {

    ArrayList<Integer> list;
    Map<Integer,Integer> map;
    public RandomizedSet() {
        list= new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        list.add(val);
        map.put(val , list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        Integer idx = map.get(val);
        list.set(idx , list.get(list.size() - 1));
        map.put(list.get(idx), idx);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.insert(2);
        boolean param_3 = obj.insert(2);

        int param_4 = obj.getRandom();
        System.out.println("param_4 = " + param_4);
        System.out.println("obj = " + obj);
    }
}
