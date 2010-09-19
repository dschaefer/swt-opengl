#include <GL/gl.h>
#include "jni.h"
#include "glext.h"
#include "glerror.h"

#ifdef WIN32
#include <windows.h>
#endif

#define M(type, ptr, func, args...) \
	ptr func = NULL; \
	extern "C" JNIEXPORT type JNICALL Java_org_eclipse_swt_opengl_GL_ \
		## func(JNIEnv * env, jclass cls, ## args) { \
		if (!func) { \
			func = (ptr)wglGetProcAddress(#func); \
			if (!func) { \
				fprintf(stderr, "'" #func "' not found\n"); \
				func = (ptr)swtGLNotImplemented; \
			} \
		} \
		swtGLError = GL_NO_ERROR; \


#define BUFF(type, name) (type *)env->GetDirectBufferAddress(name)

M(void, PFNGLBLENDCOLORPROC, glBlendColor, jfloat red, jfloat green, jfloat blue, jfloat alpha)
	glBlendColor(red, green, blue, alpha);
}
