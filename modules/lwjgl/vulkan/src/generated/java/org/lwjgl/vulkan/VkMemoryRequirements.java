/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying memory requirements.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code size} &ndash; the size, in bytes, of the memory allocation required: for the resource.</li>
 * <li>{@code alignment} &ndash; the alignment, in bytes, of the offset within the allocation required: for the resource.</li>
 * <li>{@code memoryTypeBits} &ndash; a bitmask and contains one bit set for every supported memory type for the resource. Bit {@code i} is set if and only if the memory type {@code i} in the {@link VkPhysicalDeviceMemoryProperties} structure for the physical device is supported for the resource.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkMemoryRequirements {
 *     VkDeviceSize size;
 *     VkDeviceSize alignment;
 *     uint32_t memoryTypeBits;
 * }</pre></code>
 */
public class VkMemoryRequirements extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        ALIGNMENT,
        MEMORYTYPEBITS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        ALIGNMENT = layout.offsetof(1);
        MEMORYTYPEBITS = layout.offsetof(2);
    }

    VkMemoryRequirements(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryRequirements} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryRequirements(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** Returns the value of the {@code alignment} field. */
    @NativeType("VkDeviceSize")
    public long alignment() { return nalignment(address()); }
    /** Returns the value of the {@code memoryTypeBits} field. */
    @NativeType("uint32_t")
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }

    // -----------------------------------

    /** Returns a new {@link VkMemoryRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryRequirements malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkMemoryRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryRequirements calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkMemoryRequirements} instance allocated with {@link BufferUtils}. */
    public static VkMemoryRequirements create() {
        return new VkMemoryRequirements(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkMemoryRequirements} instance for the specified memory address. */
    public static VkMemoryRequirements create(long address) {
        return new VkMemoryRequirements(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryRequirements createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkMemoryRequirements.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryRequirements.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryRequirements} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryRequirements mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkMemoryRequirements} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryRequirements callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkMemoryRequirements} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryRequirements mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryRequirements} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryRequirements callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkMemoryRequirements.SIZE); }
    /** Unsafe version of {@link #alignment}. */
    public static long nalignment(long struct) { return memGetLong(struct + VkMemoryRequirements.ALIGNMENT); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return memGetInt(struct + VkMemoryRequirements.MEMORYTYPEBITS); }

    // -----------------------------------

    /** An array of {@link VkMemoryRequirements} structs. */
    public static class Buffer extends StructBuffer<VkMemoryRequirements, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkMemoryRequirements.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryRequirements#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryRequirements newInstance(long address) {
            return new VkMemoryRequirements(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkMemoryRequirements.nsize(address()); }
        /** Returns the value of the {@code alignment} field. */
        @NativeType("VkDeviceSize")
        public long alignment() { return VkMemoryRequirements.nalignment(address()); }
        /** Returns the value of the {@code memoryTypeBits} field. */
        @NativeType("uint32_t")
        public int memoryTypeBits() { return VkMemoryRequirements.nmemoryTypeBits(address()); }

    }

}