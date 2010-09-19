package org.eclipse.swt.opengl;

import java.nio.Buffer;

/**
 * GLU version 1.2.
 * 
 * @author Doug Schaefer
 */
public class GLU {

	public static final int GLU_FALSE = 0;
	public static final int GLU_TRUE  = 1;

	public static final int GLU_VERSION    = 100800;
	public static final int GLU_EXTENSIONS = 100801;

	public static final int GLU_INVALID_ENUM      = 100900;
	public static final int GLU_INVALID_VALUE     = 100901;
	public static final int GLU_OUT_OF_MEMORY     = 100902;
	public static final int GLU_INVALID_OPERATION = 100904;

	public static final int GLU_OUTLINE_POLYGON = 100240;
	public static final int GLU_OUTLINE_PATCH   = 100241;

	public static final int GLU_NURBS_ERROR1  = 100251;
	public static final int GLU_NURBS_ERROR2  = 100252;
	public static final int GLU_NURBS_ERROR3  = 100253;
	public static final int GLU_NURBS_ERROR4  = 100254;
	public static final int GLU_NURBS_ERROR5  = 100255;
	public static final int GLU_NURBS_ERROR6  = 100256;
	public static final int GLU_NURBS_ERROR7  = 100257;
	public static final int GLU_NURBS_ERROR8  = 100258;
	public static final int GLU_NURBS_ERROR9  = 100259;
	public static final int GLU_NURBS_ERROR10 = 100260;
	public static final int GLU_NURBS_ERROR11 = 100261;
	public static final int GLU_NURBS_ERROR12 = 100262;
	public static final int GLU_NURBS_ERROR13 = 100263;
	public static final int GLU_NURBS_ERROR14 = 100264;
	public static final int GLU_NURBS_ERROR15 = 100265;
	public static final int GLU_NURBS_ERROR16 = 100266;
	public static final int GLU_NURBS_ERROR17 = 100267;
	public static final int GLU_NURBS_ERROR18 = 100268;
	public static final int GLU_NURBS_ERROR19 = 100269;
	public static final int GLU_NURBS_ERROR20 = 100270;
	public static final int GLU_NURBS_ERROR21 = 100271;
	public static final int GLU_NURBS_ERROR22 = 100272;
	public static final int GLU_NURBS_ERROR23 = 100273;
	public static final int GLU_NURBS_ERROR24 = 100274;
	public static final int GLU_NURBS_ERROR25 = 100275;
	public static final int GLU_NURBS_ERROR26 = 100276;
	public static final int GLU_NURBS_ERROR27 = 100277;
	public static final int GLU_NURBS_ERROR28 = 100278;
	public static final int GLU_NURBS_ERROR29 = 100279;
	public static final int GLU_NURBS_ERROR30 = 100280;
	public static final int GLU_NURBS_ERROR31 = 100281;
	public static final int GLU_NURBS_ERROR32 = 100282;
	public static final int GLU_NURBS_ERROR33 = 100283;
	public static final int GLU_NURBS_ERROR34 = 100284;
	public static final int GLU_NURBS_ERROR35 = 100285;
	public static final int GLU_NURBS_ERROR36 = 100286;
	public static final int GLU_NURBS_ERROR37 = 100287;
	
	public static final int GLU_AUTO_LOAD_MATRIX     = 100200;
	public static final int GLU_CULLING              = 100201;
	public static final int GLU_SAMPLING_TOLERANCE   = 100203;
	public static final int GLU_DISPLAY_MODE         = 100204;
	public static final int GLU_PARAMETRIC_TOLERANCE = 100202;
	public static final int GLU_SAMPLING_METHOD      = 100205;
	public static final int GLU_U_STEP               = 100206;
	public static final int GLU_V_STEP               = 100207;

	public static final int GLU_PATH_LENGTH      = 100215;
	public static final int GLU_PARAMETRIC_ERROR = 100216;
	public static final int GLU_DOMAIN_DISTANCE  = 100217;

	public static final int GLU_MAP1_TRIM_2 = 100210;
	public static final int GLU_MAP1_TRIM_3 = 100211;

	public static final int GLU_POINT      = 100010;
	public static final int GLU_LINE       = 100011;
	public static final int GLU_FILL       = 100012;
	public static final int GLU_SILHOUETTE = 100013;

	public static final int GLU_ERROR = 100103;

	public static final int GLU_SMOOTH = 100000;
	public static final int GLU_FLAT   = 100001;
	public static final int GLU_NONE   = 100002;

	/* QuadricOrientation */
	public static final int GLU_OUTSIDE = 100020;
	public static final int GLU_INSIDE  = 100021;

	/* TessCallback */
	public static final int GLU_TESS_BEGIN          = 100100;
	public static final int GLU_BEGIN               = 100100;
	public static final int GLU_TESS_VERTEX         = 100101;
	public static final int GLU_VERTEX              = 100101;
	public static final int GLU_TESS_END            = 100102;
	public static final int GLU_END                 = 100102;
	public static final int GLU_TESS_ERROR          = 100103;
	public static final int GLU_TESS_EDGE_FLAG      = 100104;
	public static final int GLU_EDGE_FLAG           = 100104;
	public static final int GLU_TESS_COMBINE        = 100105;
	public static final int GLU_TESS_BEGIN_DATA     = 100106;
	public static final int GLU_TESS_VERTEX_DATA    = 100107;
	public static final int GLU_TESS_END_DATA       = 100108;
	public static final int GLU_TESS_ERROR_DATA     = 100109;
	public static final int GLU_TESS_EDGE_FLAG_DATA = 100110;
	public static final int GLU_TESS_COMBINE_DATA   = 100111;

	public static final int GLU_CW       = 100120;
	public static final int GLU_CCW      = 100121;
	public static final int GLU_INTERIOR = 100122;
	public static final int GLU_EXTERIOR = 100123;
	public static final int GLU_UNKNOWN  = 100124;

	public static final int GLU_TESS_WINDING_RULE  = 100140;
	public static final int GLU_TESS_BOUNDARY_ONLY = 100141;
	public static final int GLU_TESS_TOLERANCE     = 100142;

	public static final int GLU_TESS_ERROR1                = 100151;
	public static final int GLU_TESS_ERROR2                = 100152;
	public static final int GLU_TESS_ERROR3                = 100153;
	public static final int GLU_TESS_ERROR4                = 100154;
	public static final int GLU_TESS_ERROR5                = 100155;
	public static final int GLU_TESS_ERROR6                = 100156;
	public static final int GLU_TESS_ERROR7                = 100157;
	public static final int GLU_TESS_ERROR8                = 100158;
	public static final int GLU_TESS_MISSING_BEGIN_POLYGON = 100151;
	public static final int GLU_TESS_MISSING_BEGIN_CONTOUR = 100152;
	public static final int GLU_TESS_MISSING_END_POLYGON   = 100153;
	public static final int GLU_TESS_MISSING_END_CONTOUR   = 100154;
	public static final int GLU_TESS_COORD_TOO_LARGE       = 100155;
	public static final int GLU_TESS_NEED_COMBINE_CALLBACK = 100156;

	public static final int GLU_TESS_WINDING_ODD         = 100130;
	public static final int GLU_TESS_WINDING_NONZERO     = 100131;
	public static final int GLU_TESS_WINDING_POSITIVE    = 100132;
	public static final int GLU_TESS_WINDING_NEGATIVE    = 100133;
	public static final int GLU_TESS_WINDING_ABS_GEQ_TWO = 100134;

 	public static final double GLU_TESS_MAX_COORD = 1.0e150;

	public static native void gluBeginCurve(Buffer nurb);
	public static native void gluBeginPolygon(Buffer tess);
	public static native void gluBeginSurface(Buffer nurb);
	public static native void gluBeginTrim(Buffer nurb);
	public static native int gluBuild1DMipmaps(int target, int internalFormat, int width, int format, int type, Buffer data);
	public static native int gluBuild2DMipmaps(int target, int internalFormat, int width, int height, int format, int type, Buffer data);
	public static native void gluCylinder(Buffer quad, double base, double top, double height, int slices, int stacks);
	public static native void gluDeleteNurbsRenderer(Buffer nurb);
	public static native void gluDeleteQuadric(Buffer quad);
	public static native void gluDeleteTess(Buffer tess);
	public static native void gluDisk(Buffer quad, double inner, double outer, int slices, int loops);
	public static native void gluEndCurve(Buffer nurb);
	public static native void gluEndPolygon(Buffer tess);
	public static native void gluEndSurface(Buffer nurb);
	public static native void gluEndTrim(Buffer nurb);
	public static native String gluErrorString(int error);
	public static native void gluGetNurbsProperty(Buffer nurb, int property, Buffer data);
	public static native String gluGetString (int name);
	public static native void gluGetTessProperty(Buffer tess, int which, Buffer data);
	public static native void gluLoadSamplingMatrices(Buffer nurb, Buffer model, Buffer perspective, Buffer view);
	public static native void gluLookAt(double eyeX, double eyeY, double eyeZ, double centerX, double centerY, double centerZ, double upX, double upY, double upZ);
	public static native void gluNewNurbsRenderer(Buffer nurb);
	public static native void gluNewQuadric(Buffer quad);
	public static native void gluNewTess(Buffer tess);
	public static native void gluNextContour(Buffer tess, int type);
//	public static native void gluNurbsCallback(Buffer nurb, int which, _GLUfuncptr CallBackFunc);
	public static native void gluNurbsCurve(Buffer nurb, int knotCount, Buffer knots, int stride, Buffer control, int order, int type);
	public static native void gluNurbsProperty(Buffer nurb, int property, float value);
	public static native void gluNurbsSurface(Buffer nurb, int sKnotCount, Buffer sKnots, int tKnotCount, Buffer tKnots, int sStride, int tStride, Buffer control, int sOrder, int tOrder, int type);
	public static native void gluOrtho2D (double left, double right, double bottom, double top);
	public static native void gluPartialDisk(Buffer quad, double inner, double outer, int slices, int loops, double start, double sweep);
	public static native void gluPerspective(double fovy, double aspect, double zNear, double zFar);
	public static native void gluPickMatrix(double x, double y, double delX, double delY, Buffer viewport);
	public static native int gluProject(double objX, double objY, double objZ, Buffer model, Buffer proj, Buffer view, Buffer winX, Buffer winY, Buffer winZ);
	public static native void gluPwlCurve(Buffer nurb, int count, Buffer data, int stride, int type);
//	public static native void gluQuadricCallback(Buffer quad, int which, _GLUfuncptr CallBackFunc);
	public static native void gluQuadricDrawStyle(Buffer quad, int draw);
	public static native void gluQuadricNormals(Buffer quad, int normal);
	public static native void gluQuadricOrientation(Buffer quad, int orientation);
	public static native void gluQuadricTexture(Buffer quad, boolean texture);
	public static native int gluScaleImage(int format, int wIn, int hIn, int typeIn, Buffer dataIn, int wOut, int hOut, int typeOut, Buffer dataOut);
	public static native void gluSphere(Buffer quad, double radius, int slices, int stacks);
	public static native void gluTessBeginContour(Buffer tess);
	public static native void gluTessBeginPolygon(Buffer tess, Buffer data);
//	public static native void gluTessCallback(Buffer tess, int which, _GLUfuncptr CallBackFunc);
	public static native void gluTessEndContour(Buffer tess);
	public static native void gluTessEndPolygon(Buffer tess);
	public static native void gluTessNormal(Buffer tess, double valueX, double valueY, double valueZ);
	public static native void gluTessProperty(Buffer tess, int which, double data);
	public static native void gluTessVertex(Buffer tess, Buffer location, Buffer data);
	public static native int gluUnProject(double winX, double winY, double winZ, Buffer model, Buffer proj, Buffer view, Buffer objX, Buffer objY, Buffer objZ);
	public static native int gluUnProject4(double winX, double winY, double winZ, double clipW, Buffer model, Buffer proj, Buffer view, double nearVal, double farVal, Buffer objX, Buffer objY, Buffer objZ, Buffer objW);

}
