// automatically generated by the FlatBuffers compiler, do not modify

package org.xottys.serializedemo;

import android.util.Log;

import flatbuffers.FlatBufferBuilder;
import flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import static android.content.ContentValues.TAG;

@SuppressWarnings("unused")
public final class StudentFB extends Table {
  public static StudentFB getRootAsStudentFB(ByteBuffer _bb) { return getRootAsStudentFB(_bb, new StudentFB()); }
  public static StudentFB getRootAsStudentFB(ByteBuffer _bb, StudentFB obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public StudentFB __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public long age() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean isMale() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public float weight() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public String favoriteBooks(int j) { int o = __offset(12); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int favoriteBooksLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public String interests(int j) { int o = __offset(14); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int interestsLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }

  public static int createStudentFB(FlatBufferBuilder builder,
      int nameOffset,
      long age,
      boolean isMale,
      float weight,
      int favoriteBooksOffset,
      int interestsOffset) {
    builder.startObject(6);
    StudentFB.addInterests(builder, interestsOffset);
    StudentFB.addFavoriteBooks(builder, favoriteBooksOffset);
    StudentFB.addWeight(builder, weight);
    StudentFB.addAge(builder, age);
    StudentFB.addName(builder, nameOffset);
    StudentFB.addIsMale(builder, isMale);
    return StudentFB.endStudentFB(builder);
  }

  public static void startStudentFB(FlatBufferBuilder builder) { builder.startObject(6); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addAge(FlatBufferBuilder builder, long age) { builder.addInt(1, (int)age, (int)0L); }
  public static void addIsMale(FlatBufferBuilder builder, boolean isMale) { builder.addBoolean(2, isMale, false); }
  public static void addWeight(FlatBufferBuilder builder, float weight) { builder.addFloat(3, weight, 0.0f); }
  public static void addFavoriteBooks(FlatBufferBuilder builder, int favoriteBooksOffset) { builder.addOffset(4, favoriteBooksOffset, 0); }
  public static int createFavoriteBooksVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFavoriteBooksVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addInterests(FlatBufferBuilder builder, int interestsOffset) { builder.addOffset(5, interestsOffset, 0); }
  public static int createInterestsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startInterestsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endStudentFB(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
    public String toString() {
      String[] favoriteBooks=new String[favoriteBooksLength()];
      for (int i=0;i<favoriteBooksLength();i++) {
        favoriteBooks[i]=favoriteBooks(i);
      }

      String[] interests=new String[interestsLength()];
      for (int i=0;i<interestsLength();i++) {
        interests[i]=interests(i);
        Log.i(TAG, "toString: "+i);
      }
      return "StudentFB{" +
              "name='" + name() + '\'' +
              ", age=" + age() +
              ", isMale=" + isMale() +
              ", weight=" + weight() +
              ", favoriteBooks=" + Arrays.toString(favoriteBooks) +
              ", interests=" + Arrays.toString(interests) +
              '}';
    }

}
