package csci2320;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {
  // Put your Node class and private data up here.

  // I'm giving you some helper method to make testing easier.
  @SuppressWarnings("unchecked")
  public static <K extends Comparable<K>, V> BSTMap<K, V> of(Map.KeyValuePair<K, V>... elems) {
    BSTMap<K, V> ret = new BSTMap<>();
    for (var kvp: elems) ret.put(kvp.key(), kvp.value());
    return ret;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null || !(that instanceof BSTMap)) return false;
    BSTMap<?, ?> thatSeq = (BSTMap<?, ?>)that;
    if (thatSeq.size() != size()) return false;
    for (Iterator<?> iter1 = thatSeq.iterator(), iter2 = this.iterator(); iter1.hasNext();)
      if (!iter1.next().equals(iter2.next())) return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BSTMap(");
    boolean first = true;
    for (var kvp: this) {
      if (!first) {
        sb.append(", " + kvp.key() +"->"+kvp.value());
      } else {
        sb.append(kvp.key() +"->"+kvp.value());
        first = false;
      }
    }
    sb.append(")");
    return sb.toString();
  }

  @Override
  public Iterator<KeyValuePair<K, V>> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

  @Override
  public Optional<V> put(K key, V value) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'put'");
  }

  @Override
  public Optional<V> get(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public V getOrElse(K key, V defaultValue) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOrElse'");
  }

  @Override
  public boolean contains(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public Optional<V> remove(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public int size() {
    // TODO basic implementation to get test to pass.
    return 0;
  }

  @Override
  public Set<K> keySet() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keySet'");

    // Implementation note. This can be done with an anonymous inner class.
    // You can refer to the BSTMap it is in with `BSTMap.this`. So you
    // can call things like `BSTMap.this.contains`.
  }
  
  @Override
  public <V2> BSTMap<K, V2> mapValues(Function<V, V2> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mapValues'");
  }

  @Override
  public Map<K, V> filter(Function<Map.KeyValuePair<K, V>, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'filter'");
  }

  @Override
  public Optional<Map.KeyValuePair<K, V>> find(Function<Map.KeyValuePair<K, V>, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'find'");
  }

  @Override
  public <E2> E2 fold(E2 zero, BiFunction<E2, Map.KeyValuePair<K, V>, E2> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'fold'");
  }

  @Override
  public boolean exists(Function<Map.KeyValuePair<K, V>, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'exists'");
  }

  @Override
  public boolean forall(Function<Map.KeyValuePair<K, V>, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'forall'");
  }

  /**
   * Lets this object work as a function from K to V. Gets the value if the key exists.
   * Throws an exception if it doesn't.
   * @param key the key to look up in the collection
   * @return the associated value
   */
  @Override
  public V apply(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'apply'");
  }
}
