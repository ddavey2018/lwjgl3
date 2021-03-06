/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Cumulative stats for current application.  These are not cleared until a new app connects, but they do stop accumulating once the associated app
 * disconnects.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code m_nPid} &ndash; Process id associated with these stats (may no longer be running).</li>
 * <li>{@code m_nNumFramePresents} &ndash; total number of times we called present (includes reprojected frames)</li>
 * <li>{@code m_nNumDroppedFrames} &ndash; total number of times an old frame was re-scanned out (without reprojection)</li>
 * <li>{@code m_nNumReprojectedFrames} &ndash; total number of times a frame was scanned out a second time (with reprojection)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct Compositor_CumulativeStats {
 *     uint32_t m_nPid;
 *     uint32_t m_nNumFramePresents;
 *     uint32_t m_nNumDroppedFrames;
 *     uint32_t m_nNumReprojectedFrames;
 *     uint32_t m_nNumFramePresentsOnStartup;
 *     uint32_t m_nNumDroppedFramesOnStartup;
 *     uint32_t m_nNumReprojectedFramesOnStartup;
 *     uint32_t m_nNumLoading;
 *     uint32_t m_nNumFramePresentsLoading;
 *     uint32_t m_nNumDroppedFramesLoading;
 *     uint32_t m_nNumReprojectedFramesLoading;
 *     uint32_t m_nNumTimedOut;
 *     uint32_t m_nNumFramePresentsTimedOut;
 *     uint32_t m_nNumDroppedFramesTimedOut;
 *     uint32_t m_nNumReprojectedFramesTimedOut;
 * }</pre></code>
 */
@NativeType("struct Compositor_CumulativeStats")
public class CompositorCumulativeStats extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NPID,
        M_NNUMFRAMEPRESENTS,
        M_NNUMDROPPEDFRAMES,
        M_NNUMREPROJECTEDFRAMES,
        M_NNUMFRAMEPRESENTSONSTARTUP,
        M_NNUMDROPPEDFRAMESONSTARTUP,
        M_NNUMREPROJECTEDFRAMESONSTARTUP,
        M_NNUMLOADING,
        M_NNUMFRAMEPRESENTSLOADING,
        M_NNUMDROPPEDFRAMESLOADING,
        M_NNUMREPROJECTEDFRAMESLOADING,
        M_NNUMTIMEDOUT,
        M_NNUMFRAMEPRESENTSTIMEDOUT,
        M_NNUMDROPPEDFRAMESTIMEDOUT,
        M_NNUMREPROJECTEDFRAMESTIMEDOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NPID = layout.offsetof(0);
        M_NNUMFRAMEPRESENTS = layout.offsetof(1);
        M_NNUMDROPPEDFRAMES = layout.offsetof(2);
        M_NNUMREPROJECTEDFRAMES = layout.offsetof(3);
        M_NNUMFRAMEPRESENTSONSTARTUP = layout.offsetof(4);
        M_NNUMDROPPEDFRAMESONSTARTUP = layout.offsetof(5);
        M_NNUMREPROJECTEDFRAMESONSTARTUP = layout.offsetof(6);
        M_NNUMLOADING = layout.offsetof(7);
        M_NNUMFRAMEPRESENTSLOADING = layout.offsetof(8);
        M_NNUMDROPPEDFRAMESLOADING = layout.offsetof(9);
        M_NNUMREPROJECTEDFRAMESLOADING = layout.offsetof(10);
        M_NNUMTIMEDOUT = layout.offsetof(11);
        M_NNUMFRAMEPRESENTSTIMEDOUT = layout.offsetof(12);
        M_NNUMDROPPEDFRAMESTIMEDOUT = layout.offsetof(13);
        M_NNUMREPROJECTEDFRAMESTIMEDOUT = layout.offsetof(14);
    }

    CompositorCumulativeStats(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link CompositorCumulativeStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CompositorCumulativeStats(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_nPid} field. */
    @NativeType("uint32_t")
    public int m_nPid() { return nm_nPid(address()); }
    /** Returns the value of the {@code m_nNumFramePresents} field. */
    @NativeType("uint32_t")
    public int m_nNumFramePresents() { return nm_nNumFramePresents(address()); }
    /** Returns the value of the {@code m_nNumDroppedFrames} field. */
    @NativeType("uint32_t")
    public int m_nNumDroppedFrames() { return nm_nNumDroppedFrames(address()); }
    /** Returns the value of the {@code m_nNumReprojectedFrames} field. */
    @NativeType("uint32_t")
    public int m_nNumReprojectedFrames() { return nm_nNumReprojectedFrames(address()); }
    /** Returns the value of the {@code m_nNumFramePresentsOnStartup} field. */
    @NativeType("uint32_t")
    public int m_nNumFramePresentsOnStartup() { return nm_nNumFramePresentsOnStartup(address()); }
    /** Returns the value of the {@code m_nNumDroppedFramesOnStartup} field. */
    @NativeType("uint32_t")
    public int m_nNumDroppedFramesOnStartup() { return nm_nNumDroppedFramesOnStartup(address()); }
    /** Returns the value of the {@code m_nNumReprojectedFramesOnStartup} field. */
    @NativeType("uint32_t")
    public int m_nNumReprojectedFramesOnStartup() { return nm_nNumReprojectedFramesOnStartup(address()); }
    /** Returns the value of the {@code m_nNumLoading} field. */
    @NativeType("uint32_t")
    public int m_nNumLoading() { return nm_nNumLoading(address()); }
    /** Returns the value of the {@code m_nNumFramePresentsLoading} field. */
    @NativeType("uint32_t")
    public int m_nNumFramePresentsLoading() { return nm_nNumFramePresentsLoading(address()); }
    /** Returns the value of the {@code m_nNumDroppedFramesLoading} field. */
    @NativeType("uint32_t")
    public int m_nNumDroppedFramesLoading() { return nm_nNumDroppedFramesLoading(address()); }
    /** Returns the value of the {@code m_nNumReprojectedFramesLoading} field. */
    @NativeType("uint32_t")
    public int m_nNumReprojectedFramesLoading() { return nm_nNumReprojectedFramesLoading(address()); }
    /** Returns the value of the {@code m_nNumTimedOut} field. */
    @NativeType("uint32_t")
    public int m_nNumTimedOut() { return nm_nNumTimedOut(address()); }
    /** Returns the value of the {@code m_nNumFramePresentsTimedOut} field. */
    @NativeType("uint32_t")
    public int m_nNumFramePresentsTimedOut() { return nm_nNumFramePresentsTimedOut(address()); }
    /** Returns the value of the {@code m_nNumDroppedFramesTimedOut} field. */
    @NativeType("uint32_t")
    public int m_nNumDroppedFramesTimedOut() { return nm_nNumDroppedFramesTimedOut(address()); }
    /** Returns the value of the {@code m_nNumReprojectedFramesTimedOut} field. */
    @NativeType("uint32_t")
    public int m_nNumReprojectedFramesTimedOut() { return nm_nNumReprojectedFramesTimedOut(address()); }

    // -----------------------------------

    /** Returns a new {@link CompositorCumulativeStats} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CompositorCumulativeStats malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link CompositorCumulativeStats} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CompositorCumulativeStats calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link CompositorCumulativeStats} instance allocated with {@link BufferUtils}. */
    public static CompositorCumulativeStats create() {
        return new CompositorCumulativeStats(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link CompositorCumulativeStats} instance for the specified memory address. */
    public static CompositorCumulativeStats create(long address) {
        return new CompositorCumulativeStats(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompositorCumulativeStats createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link CompositorCumulativeStats.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorCumulativeStats.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CompositorCumulativeStats.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorCumulativeStats.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CompositorCumulativeStats.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorCumulativeStats.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link CompositorCumulativeStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CompositorCumulativeStats.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompositorCumulativeStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link CompositorCumulativeStats} instance allocated on the thread-local {@link MemoryStack}. */
    public static CompositorCumulativeStats mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link CompositorCumulativeStats} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CompositorCumulativeStats callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link CompositorCumulativeStats} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CompositorCumulativeStats mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link CompositorCumulativeStats} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CompositorCumulativeStats callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CompositorCumulativeStats.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorCumulativeStats.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CompositorCumulativeStats.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorCumulativeStats.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CompositorCumulativeStats.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CompositorCumulativeStats.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CompositorCumulativeStats.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CompositorCumulativeStats.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nPid}. */
    public static int nm_nPid(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NPID); }
    /** Unsafe version of {@link #m_nNumFramePresents}. */
    public static int nm_nNumFramePresents(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMFRAMEPRESENTS); }
    /** Unsafe version of {@link #m_nNumDroppedFrames}. */
    public static int nm_nNumDroppedFrames(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMDROPPEDFRAMES); }
    /** Unsafe version of {@link #m_nNumReprojectedFrames}. */
    public static int nm_nNumReprojectedFrames(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMREPROJECTEDFRAMES); }
    /** Unsafe version of {@link #m_nNumFramePresentsOnStartup}. */
    public static int nm_nNumFramePresentsOnStartup(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMFRAMEPRESENTSONSTARTUP); }
    /** Unsafe version of {@link #m_nNumDroppedFramesOnStartup}. */
    public static int nm_nNumDroppedFramesOnStartup(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMDROPPEDFRAMESONSTARTUP); }
    /** Unsafe version of {@link #m_nNumReprojectedFramesOnStartup}. */
    public static int nm_nNumReprojectedFramesOnStartup(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMREPROJECTEDFRAMESONSTARTUP); }
    /** Unsafe version of {@link #m_nNumLoading}. */
    public static int nm_nNumLoading(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMLOADING); }
    /** Unsafe version of {@link #m_nNumFramePresentsLoading}. */
    public static int nm_nNumFramePresentsLoading(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMFRAMEPRESENTSLOADING); }
    /** Unsafe version of {@link #m_nNumDroppedFramesLoading}. */
    public static int nm_nNumDroppedFramesLoading(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMDROPPEDFRAMESLOADING); }
    /** Unsafe version of {@link #m_nNumReprojectedFramesLoading}. */
    public static int nm_nNumReprojectedFramesLoading(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMREPROJECTEDFRAMESLOADING); }
    /** Unsafe version of {@link #m_nNumTimedOut}. */
    public static int nm_nNumTimedOut(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMTIMEDOUT); }
    /** Unsafe version of {@link #m_nNumFramePresentsTimedOut}. */
    public static int nm_nNumFramePresentsTimedOut(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMFRAMEPRESENTSTIMEDOUT); }
    /** Unsafe version of {@link #m_nNumDroppedFramesTimedOut}. */
    public static int nm_nNumDroppedFramesTimedOut(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMDROPPEDFRAMESTIMEDOUT); }
    /** Unsafe version of {@link #m_nNumReprojectedFramesTimedOut}. */
    public static int nm_nNumReprojectedFramesTimedOut(long struct) { return memGetInt(struct + CompositorCumulativeStats.M_NNUMREPROJECTEDFRAMESTIMEDOUT); }

    // -----------------------------------

    /** An array of {@link CompositorCumulativeStats} structs. */
    public static class Buffer extends StructBuffer<CompositorCumulativeStats, Buffer> implements NativeResource {

        /**
         * Creates a new {@link CompositorCumulativeStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CompositorCumulativeStats#SIZEOF}, and its mark will be undefined.
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
        protected CompositorCumulativeStats newInstance(long address) {
            return new CompositorCumulativeStats(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code m_nPid} field. */
        @NativeType("uint32_t")
        public int m_nPid() { return CompositorCumulativeStats.nm_nPid(address()); }
        /** Returns the value of the {@code m_nNumFramePresents} field. */
        @NativeType("uint32_t")
        public int m_nNumFramePresents() { return CompositorCumulativeStats.nm_nNumFramePresents(address()); }
        /** Returns the value of the {@code m_nNumDroppedFrames} field. */
        @NativeType("uint32_t")
        public int m_nNumDroppedFrames() { return CompositorCumulativeStats.nm_nNumDroppedFrames(address()); }
        /** Returns the value of the {@code m_nNumReprojectedFrames} field. */
        @NativeType("uint32_t")
        public int m_nNumReprojectedFrames() { return CompositorCumulativeStats.nm_nNumReprojectedFrames(address()); }
        /** Returns the value of the {@code m_nNumFramePresentsOnStartup} field. */
        @NativeType("uint32_t")
        public int m_nNumFramePresentsOnStartup() { return CompositorCumulativeStats.nm_nNumFramePresentsOnStartup(address()); }
        /** Returns the value of the {@code m_nNumDroppedFramesOnStartup} field. */
        @NativeType("uint32_t")
        public int m_nNumDroppedFramesOnStartup() { return CompositorCumulativeStats.nm_nNumDroppedFramesOnStartup(address()); }
        /** Returns the value of the {@code m_nNumReprojectedFramesOnStartup} field. */
        @NativeType("uint32_t")
        public int m_nNumReprojectedFramesOnStartup() { return CompositorCumulativeStats.nm_nNumReprojectedFramesOnStartup(address()); }
        /** Returns the value of the {@code m_nNumLoading} field. */
        @NativeType("uint32_t")
        public int m_nNumLoading() { return CompositorCumulativeStats.nm_nNumLoading(address()); }
        /** Returns the value of the {@code m_nNumFramePresentsLoading} field. */
        @NativeType("uint32_t")
        public int m_nNumFramePresentsLoading() { return CompositorCumulativeStats.nm_nNumFramePresentsLoading(address()); }
        /** Returns the value of the {@code m_nNumDroppedFramesLoading} field. */
        @NativeType("uint32_t")
        public int m_nNumDroppedFramesLoading() { return CompositorCumulativeStats.nm_nNumDroppedFramesLoading(address()); }
        /** Returns the value of the {@code m_nNumReprojectedFramesLoading} field. */
        @NativeType("uint32_t")
        public int m_nNumReprojectedFramesLoading() { return CompositorCumulativeStats.nm_nNumReprojectedFramesLoading(address()); }
        /** Returns the value of the {@code m_nNumTimedOut} field. */
        @NativeType("uint32_t")
        public int m_nNumTimedOut() { return CompositorCumulativeStats.nm_nNumTimedOut(address()); }
        /** Returns the value of the {@code m_nNumFramePresentsTimedOut} field. */
        @NativeType("uint32_t")
        public int m_nNumFramePresentsTimedOut() { return CompositorCumulativeStats.nm_nNumFramePresentsTimedOut(address()); }
        /** Returns the value of the {@code m_nNumDroppedFramesTimedOut} field. */
        @NativeType("uint32_t")
        public int m_nNumDroppedFramesTimedOut() { return CompositorCumulativeStats.nm_nNumDroppedFramesTimedOut(address()); }
        /** Returns the value of the {@code m_nNumReprojectedFramesTimedOut} field. */
        @NativeType("uint32_t")
        public int m_nNumReprojectedFramesTimedOut() { return CompositorCumulativeStats.nm_nNumReprojectedFramesTimedOut(address()); }

    }

}