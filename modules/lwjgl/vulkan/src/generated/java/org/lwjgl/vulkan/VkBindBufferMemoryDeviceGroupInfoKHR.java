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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkBindBufferMemoryDeviceGroupInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkBindBufferMemoryDeviceGroupInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t deviceIndexCount;
 *     uint32_t const * pDeviceIndices;
 * }</pre></code>
 */
public class VkBindBufferMemoryDeviceGroupInfoKHR extends VkBindBufferMemoryDeviceGroupInfo {

    VkBindBufferMemoryDeviceGroupInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkBindBufferMemoryDeviceGroupInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindBufferMemoryDeviceGroupInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBindBufferMemoryDeviceGroupInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBindBufferMemoryDeviceGroupInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    @Override
    public VkBindBufferMemoryDeviceGroupInfoKHR pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBindBufferMemoryDeviceGroupInfoKHR set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindBufferMemoryDeviceGroupInfoKHR set(VkBindBufferMemoryDeviceGroupInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR create() {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR} instance for the specified memory address. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR create(long address) {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryDeviceGroupInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBindBufferMemoryDeviceGroupInfoKHR} structs. */
    public static class Buffer extends VkBindBufferMemoryDeviceGroupInfo.Buffer {

        /**
         * Creates a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindBufferMemoryDeviceGroupInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkBindBufferMemoryDeviceGroupInfoKHR newInstance(long address) {
            return new VkBindBufferMemoryDeviceGroupInfoKHR(address, container);
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBindBufferMemoryDeviceGroupInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindBufferMemoryDeviceGroupInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBindBufferMemoryDeviceGroupInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindBufferMemoryDeviceGroupInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        @Override
        public VkBindBufferMemoryDeviceGroupInfoKHR.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindBufferMemoryDeviceGroupInfoKHR.npDeviceIndices(address(), value); return this; }

    }

}