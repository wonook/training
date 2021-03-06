import java.util.*;

public class HashPartitioner<K, V> implements Partitioner<K, V> {
  /**
   * @param keyValues iterator(key, value)
   * @return (destinationIndex -> iterator(key, value))
   */
  @Override
  public Map<K, Integer> partition(Iterator<KV<K, V>> keyValues) {
    // TODO: Perform Hash-partitioning
    HashMap<K, Integer> map = new HashMap<>();
    while (keyValues.hasNext()) {
      K key = keyValues.next().key;
      map.put(key, key.hashCode()%3);
    }
    System.out.println(map);
    return map;
  }
}
