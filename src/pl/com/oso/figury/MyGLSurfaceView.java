package pl.com.oso.figury;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {

	public MyGLSurfaceView(Context context) {
		super(context);
		
		// Create an OpenGL ES 2.0 context
		setEGLContextClientVersion(2);
		
		setRenderer(new MyRenderer());
		
		// Render the view only when there is a change in the drawing data
		setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

	}

}
