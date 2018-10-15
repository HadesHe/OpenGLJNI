package com.example.administrator.myapplication

import android.content.Context
import android.graphics.PixelFormat
import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGL10
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.egl.EGLContext
import javax.microedition.khronos.egl.EGLDisplay

class GL2JNIView(context: Context,translucent: Boolean,depth: Int,stencil: Int) : GLSurfaceView(context) {

    init{
        if(translucent){
            holder.setFormat(PixelFormat.TRANSLUCENT)
        }

        setEGLContextFactory(ContextFactory())
    }

    inner class ContextFactory:GLSurfaceView.EGLContextFactory{
        override fun createContext(egl: EGL10?, display: EGLDisplay?, eglConfig: EGLConfig?): EGLContext {
            checkEglError("Before eglCreateContext",egl)
        }

        override fun destroyContext(egl: EGL10?, display: EGLDisplay?, context: EGLContext?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }


    }


}