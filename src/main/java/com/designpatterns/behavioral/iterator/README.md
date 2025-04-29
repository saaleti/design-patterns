# 🎵 Iterator Design Pattern - Playlist Example

The **Iterator Design Pattern** is a behavioral pattern that provides a way to access elements of a collection sequentially without exposing its internal structure.

---

## 📚 Purpose

- Traverse collections (lists, trees, sets, etc.) without revealing how they are implemented.
- Promote loose coupling between collection and traversal logic.

---

## 🎧 Real-World Example: Playlist

Imagine a playlist where you want to play songs one at a time. The internal data structure (ArrayList, LinkedList, etc.) doesn't matter—you just want to iterate through songs.

---

## 🧩 Structure

- **Iterator Interface**: Defines `hasNext()` and `next()` methods.
- **Concrete Iterator**: Implements the interface and controls iteration.
- **Aggregate**: Provides access to the iterator (in this case, the playlist).
- **Client**: Uses the iterator to traverse items.

---

## 💻 Code Overview

### Interface
```java
public interface SongIterator {
    boolean hasNext();
    String next();
}
```