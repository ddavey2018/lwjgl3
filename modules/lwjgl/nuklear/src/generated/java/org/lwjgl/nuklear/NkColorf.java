/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_colorf {
 *     float r;
 *     float g;
 *     float b;
 *     float a;
 * }</pre></code>
 */
@NativeType("struct nk_colorf")
public class NkColorf extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B,
        A;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    NkColorf(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkColorf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkColorf(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code r} field. */
    public float r() { return nr(address()); }
    /** Returns the value of the {@code g} field. */
    public float g() { return ng(address()); }
    /** Returns the value of the {@code b} field. */
    public float b() { return nb(address()); }
    /** Returns the value of the {@code a} field. */
    public float a() { return na(address()); }

    /** Sets the specified value to the {@code r} field. */
    public NkColorf r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public NkColorf g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public NkColorf b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public NkColorf a(float value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkColorf set(
        float r,
        float g,
        float b,
        float a
    ) {
        r(r);
        g(g);
        b(b);
        a(a);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkColorf set(NkColorf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link NkColorf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkColorf malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link NkColorf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkColorf calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link NkColorf} instance allocated with {@link BufferUtils}. */
    public static NkColorf create() {
        return new NkColorf(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link NkColorf} instance for the specified memory address. */
    public static NkColorf create(long address) {
        return new NkColorf(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkColorf createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link NkColorf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkColorf.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkColorf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkColorf.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkColorf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkColorf.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link NkColorf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkColorf.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkColorf.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link NkColorf} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkColorf mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link NkColorf} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkColorf callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link NkColorf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkColorf mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link NkColorf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkColorf callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkColorf.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkColorf.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkColorf.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkColorf.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkColorf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkColorf.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkColorf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkColorf.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return memGetFloat(struct + NkColorf.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return memGetFloat(struct + NkColorf.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return memGetFloat(struct + NkColorf.B); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return memGetFloat(struct + NkColorf.A); }

    /** Unsafe version of {@link #r(float) r}. */
    public static void nr(long struct, float value) { memPutFloat(struct + NkColorf.R, value); }
    /** Unsafe version of {@link #g(float) g}. */
    public static void ng(long struct, float value) { memPutFloat(struct + NkColorf.G, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { memPutFloat(struct + NkColorf.B, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { memPutFloat(struct + NkColorf.A, value); }

    // -----------------------------------

    /** An array of {@link NkColorf} structs. */
    public static class Buffer extends StructBuffer<NkColorf, Buffer> implements NativeResource {

        /**
         * Creates a new {@link NkColorf.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkColorf#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NkColorf newInstance(long address) {
            return new NkColorf(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code r} field. */
        public float r() { return NkColorf.nr(address()); }
        /** Returns the value of the {@code g} field. */
        public float g() { return NkColorf.ng(address()); }
        /** Returns the value of the {@code b} field. */
        public float b() { return NkColorf.nb(address()); }
        /** Returns the value of the {@code a} field. */
        public float a() { return NkColorf.na(address()); }

        /** Sets the specified value to the {@code r} field. */
        public NkColorf.Buffer r(float value) { NkColorf.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public NkColorf.Buffer g(float value) { NkColorf.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public NkColorf.Buffer b(float value) { NkColorf.nb(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public NkColorf.Buffer a(float value) { NkColorf.na(address(), value); return this; }

    }

}