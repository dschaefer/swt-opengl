/*******************************************************************************
 * Copyright (c) 2010, Wind River Systems and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Wind River Systems - Initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.opengl;

import java.nio.Buffer;

public class GL {
	
	static {
		System.loadLibrary("swt-opengl");
	}
	
	//
	// GL_VERSION_1_1
	//
	
	public static final int GL_FALSE = 0x0;
	public static final int GL_TRUE  = 0x1;

	public static final int GL_BYTE           = 0x1400;
	public static final int GL_UNSIGNED_BYTE  = 0x1401;
	public static final int GL_SHORT          = 0x1402;
	public static final int GL_UNSIGNED_SHORT = 0x1403;
	public static final int GL_INT            = 0x1404;
	public static final int GL_UNSIGNED_INT   = 0x1405;
	public static final int GL_FLOAT          = 0x1406;
	public static final int GL_DOUBLE         = 0x140A;
	public static final int GL_2_BYTES        = 0x1407;
	public static final int GL_3_BYTES        = 0x1408;
	public static final int GL_4_BYTES        = 0x1409;

	public static final int GL_POINTS         = 0x0000;
	public static final int GL_LINES          = 0x0001;
	public static final int GL_LINE_LOOP      = 0x0002;
	public static final int GL_LINE_STRIP     = 0x0003;
	public static final int GL_TRIANGLES      = 0x0004;
	public static final int GL_TRIANGLE_STRIP = 0x0005;
	public static final int GL_TRIANGLE_FAN   = 0x0006;
	public static final int GL_QUADS          = 0x0007;
	public static final int GL_QUAD_STRIP     = 0x0008;
	public static final int GL_POLYGON        = 0x0009;
	
	public static final int GL_VERTEX_ARRAY                = 0x8074;
	public static final int GL_NORMAL_ARRAY                = 0x8075; 
	public static final int GL_COLOR_ARRAY                 = 0x8076;
	public static final int GL_INDEX_ARRAY                 = 0x8077;
	public static final int GL_TEXTURE_COORD_ARRAY         = 0x8078;
	public static final int GL_EDGE_FLAG_ARRAY             = 0x8079;
	public static final int GL_VERTEX_ARRAY_SIZE           = 0x807A;
	public static final int GL_VERTEX_ARRAY_TYPE           = 0x807B;
	public static final int GL_VERTEX_ARRAY_STRIDE         = 0x807C;
	public static final int GL_NORMAL_ARRAY_TYPE           = 0x807E;
	public static final int GL_NORMAL_ARRAY_STRIDE         = 0x807F;
	public static final int GL_COLOR_ARRAY_SIZE            = 0x8081;
	public static final int GL_COLOR_ARRAY_TYPE            = 0x8082;
	public static final int GL_COLOR_ARRAY_STRIDE          = 0x8083;
	public static final int GL_INDEX_ARRAY_TYPE            = 0x8085;
	public static final int GL_INDEX_ARRAY_STRIDE          = 0x8086;
	public static final int GL_TEXTURE_COORD_ARRAY_SIZE    = 0x8088;
	public static final int GL_TEXTURE_COORD_ARRAY_TYPE    = 0x8089;
	public static final int GL_TEXTURE_COORD_ARRAY_STRIDE  = 0x808A;
	public static final int GL_EDGE_FLAG_ARRAY_STRIDE      = 0x808C;
	public static final int GL_VERTEX_ARRAY_POINTER        = 0x808E;
	public static final int GL_NORMAL_ARRAY_POINTER        = 0x808F;
	public static final int GL_COLOR_ARRAY_POINTER         = 0x8090;
	public static final int GL_INDEX_ARRAY_POINTER         = 0x8091;
	public static final int GL_TEXTURE_COORD_ARRAY_POINTER = 0x8092;
	public static final int GL_EDGE_FLAG_ARRAY_POINTER     = 0x8093;
	public static final int GL_V2F                         = 0x2A20;
	public static final int GL_V3F                         = 0x2A21;
	public static final int GL_C4UB_V2F                    = 0x2A22;
	public static final int GL_C4UB_V3F                    = 0x2A23;
	public static final int GL_C3F_V3F                     = 0x2A24;
	public static final int GL_N3F_V3F                     = 0x2A25;
	public static final int GL_C4F_N3F_V3F                 = 0x2A26;
	public static final int GL_T2F_V3F                     = 0x2A27;
	public static final int GL_T4F_V4F                     = 0x2A28;
	public static final int GL_T2F_C4UB_V3F                = 0x2A29;
	public static final int GL_T2F_C3F_V3F                 = 0x2A2A;
	public static final int GL_T2F_N3F_V3F                 = 0x2A2B;
	public static final int GL_T2F_C4F_N3F_V3F             = 0x2A2C;
	public static final int GL_T4F_C4F_N3F_V4F             = 0x2A2D;

	public static final int GL_MATRIX_MODE = 0x0BA0;
	public static final int GL_MODELVIEW   = 0x1700;
	public static final int GL_PROJECTION  = 0x1701;
	public static final int GL_TEXTURE     = 0x1702;

	public static final int GL_POINT_SMOOTH           = 0x0B10;
	public static final int GL_POINT_SIZE             = 0x0B11;
	public static final int GL_POINT_SIZE_GRANULARITY = 0x0B13;
	public static final int GL_POINT_SIZE_RANGE       = 0x0B12;

	public static final int GL_LINE_SMOOTH            = 0x0B20;
	public static final int GL_LINE_STIPPLE           = 0x0B24;
	public static final int GL_LINE_STIPPLE_PATTERN   = 0x0B25;
	public static final int GL_LINE_STIPPLE_REPEAT    = 0x0B26;
	public static final int GL_LINE_WIDTH             = 0x0B21;
	public static final int GL_LINE_WIDTH_GRANULARITY = 0x0B23;
	public static final int GL_LINE_WIDTH_RANGE       = 0x0B22;

	public static final int GL_POINT                 = 0x1B00;
	public static final int GL_LINE                  = 0x1B01;
	public static final int GL_FILL                  = 0x1B02;
	public static final int GL_CW                    = 0x0900;
	public static final int GL_CCW                   = 0x0901;
	public static final int GL_FRONT                 = 0x0404;
	public static final int GL_BACK                  = 0x0405;
	public static final int GL_POLYGON_MODE          = 0x0B40;
	public static final int GL_POLYGON_SMOOTH        = 0x0B41;
	public static final int GL_POLYGON_STIPPLE       = 0x0B42;
	public static final int GL_EDGE_FLAG             = 0x0B43;
	public static final int GL_CULL_FACE             = 0x0B44;
	public static final int GL_CULL_FACE_MODE        = 0x0B45;
	public static final int GL_FRONT_FACE            = 0x0B46;
	public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;
	public static final int GL_POLYGON_OFFSET_UNITS  = 0x2A00;
	public static final int GL_POLYGON_OFFSET_POINT  = 0x2A01;
	public static final int GL_POLYGON_OFFSET_LINE   = 0x2A02;
	public static final int GL_POLYGON_OFFSET_FILL   = 0x8037;

	public static final int GL_COMPILE             = 0x1300;
	public static final int GL_COMPILE_AND_EXECUTE = 0x1301;
	public static final int GL_LIST_BASE           = 0x0B32;
	public static final int GL_LIST_INDEX          = 0x0B33;
	public static final int GL_LIST_MODE           = 0x0B30;

	public static final int GL_NEVER             = 0x0200;
	public static final int GL_LESS              = 0x0201;
	public static final int GL_EQUAL             = 0x0202;
	public static final int GL_LEQUAL            = 0x0203;
	public static final int GL_GREATER           = 0x0204;
	public static final int GL_NOTEQUAL          = 0x0205;
	public static final int GL_GEQUAL            = 0x0206;
	public static final int GL_ALWAYS            = 0x0207;
	public static final int GL_DEPTH_TEST        = 0x0B71;
	public static final int GL_DEPTH_BITS        = 0x0D56;
	public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;
	public static final int GL_DEPTH_FUNC        = 0x0B74;
	public static final int GL_DEPTH_RANGE       = 0x0B70;
	public static final int GL_DEPTH_WRITEMASK   = 0x0B72;
	public static final int GL_DEPTH_COMPONENT   = 0x1902;

	public static final int GL_LIGHTING                 = 0x0B50;
	public static final int GL_LIGHT0                   = 0x4000;
	public static final int GL_LIGHT1                   = 0x4001;
	public static final int GL_LIGHT2                   = 0x4002;
	public static final int GL_LIGHT3                   = 0x4003;
	public static final int GL_LIGHT4                   = 0x4004;
	public static final int GL_LIGHT5                   = 0x4005;
	public static final int GL_LIGHT6                   = 0x4006;
	public static final int GL_LIGHT7                   = 0x4007;
	public static final int GL_SPOT_EXPONENT            = 0x1205;
	public static final int GL_SPOT_CUTOFF              = 0x1206;
	public static final int GL_CONSTANT_ATTENUATION     = 0x1207;
	public static final int GL_LINEAR_ATTENUATION       = 0x1208;
	public static final int GL_QUADRATIC_ATTENUATION    = 0x1209;
	public static final int GL_AMBIENT                  = 0x1200;
	public static final int GL_DIFFUSE                  = 0x1201;
	public static final int GL_SPECULAR                 = 0x1202;
	public static final int GL_SHININESS                = 0x1601;
	public static final int GL_EMISSION                 = 0x1600;
	public static final int GL_POSITION                 = 0x1203;
	public static final int GL_SPOT_DIRECTION           = 0x1204;
	public static final int GL_AMBIENT_AND_DIFFUSE      = 0x1602;
	public static final int GL_COLOR_INDEXES            = 0x1603;
	public static final int GL_LIGHT_MODEL_TWO_SIDE     = 0x0B52;
	public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = 0x0B51;
	public static final int GL_LIGHT_MODEL_AMBIENT      = 0x0B53;
	public static final int GL_FRONT_AND_BACK           = 0x0408;
	public static final int GL_SHADE_MODEL              = 0x0B54;
	public static final int GL_FLAT                     = 0x1D00;
	public static final int GL_SMOOTH                   = 0x1D01;
	public static final int GL_COLOR_MATERIAL           = 0x0B57;
	public static final int GL_COLOR_MATERIAL_FACE      = 0x0B55;
	public static final int GL_COLOR_MATERIAL_PARAMETER = 0x0B56;
	public static final int GL_NORMALIZE                = 0x0BA1;

	public static final int GL_CLIP_PLANE0 = 0x3000;
	public static final int GL_CLIP_PLANE1 = 0x3001;
	public static final int GL_CLIP_PLANE2 = 0x3002;
	public static final int GL_CLIP_PLANE3 = 0x3003;
	public static final int GL_CLIP_PLANE4 = 0x3004;
	public static final int GL_CLIP_PLANE5 = 0x3005;

	public static final int GL_ACCUM_RED_BITS    = 0x0D58;
	public static final int GL_ACCUM_GREEN_BITS  = 0x0D59;
	public static final int GL_ACCUM_BLUE_BITS   = 0x0D5A;
	public static final int GL_ACCUM_ALPHA_BITS  = 0x0D5B;
	public static final int GL_ACCUM_CLEAR_VALUE = 0x0B80;
	public static final int GL_ACCUM             = 0x0100;
	public static final int GL_ADD               = 0x0104;
	public static final int GL_LOAD              = 0x0101;
	public static final int GL_MULT              = 0x0103;
	public static final int GL_RETURN            = 0x0102;

	public static final int GL_ALPHA_TEST      = 0x0BC0;
	public static final int GL_ALPHA_TEST_REF  = 0x0BC2;
	public static final int GL_ALPHA_TEST_FUNC = 0x0BC1;

	public static final int GL_BLEND                    = 0x0BE2;
	public static final int GL_BLEND_SRC                = 0x0BE1;
	public static final int GL_BLEND_DST                = 0x0BE0;
	public static final int GL_ZERO                     = 0x0;
	public static final int GL_ONE                      = 0x1;
	public static final int GL_SRC_COLOR                = 0x0300;
	public static final int GL_ONE_MINUS_SRC_COLOR      = 0x0301;
	public static final int GL_SRC_ALPHA                = 0x0302;
	public static final int GL_ONE_MINUS_SRC_ALPHA      = 0x0303;
	public static final int GL_DST_ALPHA                = 0x0304;
	public static final int GL_ONE_MINUS_DST_ALPHA      = 0x0305;
	public static final int GL_DST_COLOR                = 0x0306;
	public static final int GL_ONE_MINUS_DST_COLOR      = 0x0307;
	public static final int GL_SRC_ALPHA_SATURATE       = 0x0308;
	public static final int GL_CONSTANT_COLOR           = 0x8001;
	public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;
	public static final int GL_CONSTANT_ALPHA           = 0x8003;
	public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

	public static final int GL_FEEDBACK = 0x1C01;
	public static final int GL_RENDER   = 0x1C00;
	public static final int GL_SELECT   = 0x1C02;

	public static final int GL_2D                      = 0x0600;
	public static final int GL_3D                      = 0x0601;
	public static final int GL_3D_COLOR                = 0x0602;
	public static final int GL_3D_COLOR_TEXTURE        = 0x0603;
	public static final int GL_4D_COLOR_TEXTURE        = 0x0604;
	public static final int GL_POINT_TOKEN             = 0x0701;
	public static final int GL_LINE_TOKEN              = 0x0702;
	public static final int GL_LINE_RESET_TOKEN        = 0x0707;
	public static final int GL_POLYGON_TOKEN           = 0x0703;
	public static final int GL_BITMAP_TOKEN            = 0x0704;
	public static final int GL_DRAW_PIXEL_TOKEN        = 0x0705;
	public static final int GL_COPY_PIXEL_TOKEN        = 0x0706;
	public static final int GL_PASS_THROUGH_TOKEN      = 0x0700;
	public static final int GL_FEEDBACK_BUFFER_POINTER = 0x0DF0;
	public static final int GL_FEEDBACK_BUFFER_SIZE    = 0x0DF1;
	public static final int GL_FEEDBACK_BUFFER_TYPE    = 0x0DF2;

	public static final int GL_SELECTION_BUFFER_POINTER = 0x0DF3;
	public static final int GL_SELECTION_BUFFER_SIZE    = 0x0DF4;

	public static final int GL_FOG         = 0x0B60;
	public static final int GL_FOG_MODE    = 0x0B65;
	public static final int GL_FOG_DENSITY = 0x0B62;
	public static final int GL_FOG_COLOR   = 0x0B66;
	public static final int GL_FOG_INDEX   = 0x0B61;
	public static final int GL_FOG_START   = 0x0B63;
	public static final int GL_FOG_END     = 0x0B64;
	public static final int GL_LINEAR      = 0x2601;
	public static final int GL_EXP         = 0x0800;
	public static final int GL_EXP2        = 0x0801;

	public static final int GL_LOGIC_OP       = 0x0BF1;
	public static final int GL_INDEX_LOGIC_OP = 0x0BF1;
	public static final int GL_COLOR_LOGIC_OP = 0x0BF2;
	public static final int GL_LOGIC_OP_MODE  = 0x0BF0;
	public static final int GL_CLEAR          = 0x1500;
	public static final int GL_SET            = 0x150F;
	public static final int GL_COPY           = 0x1503;
	public static final int GL_COPY_INVERTED  = 0x150C;
	public static final int GL_NOOP           = 0x1505;
	public static final int GL_INVERT         = 0x150A;
	public static final int GL_AND            = 0x1501;
	public static final int GL_NAND           = 0x150E;
	public static final int GL_OR             = 0x1507;
	public static final int GL_NOR            = 0x1508;
	public static final int GL_XOR            = 0x1506;
	public static final int GL_EQUIV          = 0x1509;
	public static final int GL_AND_REVERSE    = 0x1502;
	public static final int GL_AND_INVERTED   = 0x1504;
	public static final int GL_OR_REVERSE     = 0x150B;
	public static final int GL_OR_INVERTED    = 0x150D;

	public static final int GL_STENCIL_TEST            = 0x0B90;
	public static final int GL_STENCIL_WRITEMASK       = 0x0B98;
	public static final int GL_STENCIL_BITS            = 0x0D57;
	public static final int GL_STENCIL_FUNC            = 0x0B92;
	public static final int GL_STENCIL_VALUE_MASK      = 0x0B93;
	public static final int GL_STENCIL_REF             = 0x0B97;
	public static final int GL_STENCIL_FAIL            = 0x0B94;
	public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;
	public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;
	public static final int GL_STENCIL_CLEAR_VALUE     = 0x0B91;
	public static final int GL_STENCIL_INDEX           = 0x1901;
	public static final int GL_KEEP                    = 0x1E00;
	public static final int GL_REPLACE                 = 0x1E01;
	public static final int GL_INCR                    = 0x1E02;
	public static final int GL_DECR                    = 0x1E03;

	public static final int GL_NONE            = 0x0;
	public static final int GL_LEFT            = 0x0406;
	public static final int GL_RIGHT           = 0x0407;
	public static final int GL_FRONT_LEFT      = 0x0400;
	public static final int GL_FRONT_RIGHT     = 0x0401;
	public static final int GL_BACK_LEFT       = 0x0402;
	public static final int GL_BACK_RIGHT      = 0x0403;
	public static final int GL_AUX0            = 0x0409;
	public static final int GL_AUX1            = 0x040A;
	public static final int GL_AUX2            = 0x040B;
	public static final int GL_AUX3            = 0x040C;
	public static final int GL_COLOR_INDEX     = 0x1900;
	public static final int GL_RED             = 0x1903;
	public static final int GL_GREEN           = 0x1904;
	public static final int GL_BLUE            = 0x1905;
	public static final int GL_ALPHA           = 0x1906;
	public static final int GL_LUMINANCE       = 0x1909;
	public static final int GL_LUMINANCE_ALPHA = 0x190A;
	public static final int GL_ALPHA_BITS      = 0x0D55;
	public static final int GL_RED_BITS        = 0x0D52;
	public static final int GL_GREEN_BITS      = 0x0D53;
	public static final int GL_BLUE_BITS       = 0x0D54;
	public static final int GL_INDEX_BITS      = 0x0D51;
	public static final int GL_SUBPIXEL_BITS   = 0x0D50;
	public static final int GL_AUX_BUFFERS     = 0x0C00;
	public static final int GL_READ_BUFFER     = 0x0C02;
	public static final int GL_DRAW_BUFFER     = 0x0C01;
	public static final int GL_DOUBLEBUFFER    = 0x0C32;
	public static final int GL_STEREO          = 0x0C33;
	public static final int GL_BITMAP          = 0x1A00;
	public static final int GL_COLOR           = 0x1800;
	public static final int GL_DEPTH           = 0x1801;
	public static final int GL_STENCIL         = 0x1802;
	public static final int GL_DITHER          = 0x0BD0;
	public static final int GL_RGB             = 0x1907;
	public static final int GL_RGBA            = 0x1908;

	public static final int GL_MAX_LIST_NESTING              = 0x0B31;
	public static final int GL_MAX_ATTRIB_STACK_DEPTH        = 0x0D35;
	public static final int GL_MAX_MODELVIEW_STACK_DEPTH     = 0x0D36;
	public static final int GL_MAX_NAME_STACK_DEPTH          = 0x0D37;
	public static final int GL_MAX_PROJECTION_STACK_DEPTH    = 0x0D38;
	public static final int GL_MAX_TEXTURE_STACK_DEPTH       = 0x0D39;
	public static final int GL_MAX_EVAL_ORDER                = 0x0D30;
	public static final int GL_MAX_LIGHTS                    = 0x0D31;
	public static final int GL_MAX_CLIP_PLANES               = 0x0D32;
	public static final int GL_MAX_TEXTURE_SIZE              = 0x0D33;
	public static final int GL_MAX_PIXEL_MAP_TABLE           = 0x0D34;
	public static final int GL_MAX_VIEWPORT_DIMS             = 0x0D3A;
	public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 0x0D3B;

	public static final int GL_ATTRIB_STACK_DEPTH            = 0x0BB0;
	public static final int GL_CLIENT_ATTRIB_STACK_DEPTH     = 0x0BB1;
	public static final int GL_COLOR_CLEAR_VALUE             = 0x0C22;
	public static final int GL_COLOR_WRITEMASK               = 0x0C23;
	public static final int GL_CURRENT_INDEX                 = 0x0B01;
	public static final int GL_CURRENT_COLOR                 = 0x0B00;
	public static final int GL_CURRENT_NORMAL                = 0x0B02;
	public static final int GL_CURRENT_RASTER_COLOR          = 0x0B04;
	public static final int GL_CURRENT_RASTER_DISTANCE       = 0x0B09;
	public static final int GL_CURRENT_RASTER_INDEX          = 0x0B05;
	public static final int GL_CURRENT_RASTER_POSITION       = 0x0B07;
	public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = 0x0B06;
	public static final int GL_CURRENT_RASTER_POSITION_VALID = 0x0B08;
	public static final int GL_CURRENT_TEXTURE_COORDS        = 0x0B03;
	public static final int GL_INDEX_CLEAR_VALUE             = 0x0C20;
	public static final int GL_INDEX_MODE                    = 0x0C30;
	public static final int GL_INDEX_WRITEMASK               = 0x0C21;
	public static final int GL_MODELVIEW_MATRIX              = 0x0BA6;
	public static final int GL_MODELVIEW_STACK_DEPTH         = 0x0BA3;
	public static final int GL_NAME_STACK_DEPTH              = 0x0D70;
	public static final int GL_PROJECTION_MATRIX             = 0x0BA7;
	public static final int GL_PROJECTION_STACK_DEPTH        = 0x0BA4;
	public static final int GL_RENDER_MODE                   = 0x0C40;
	public static final int GL_RGBA_MODE                     = 0x0C31;
	public static final int GL_TEXTURE_MATRIX                = 0x0BA8;
	public static final int GL_TEXTURE_STACK_DEPTH           = 0x0BA5;
	public static final int GL_VIEWPORT                      = 0x0BA2;

	public static final int GL_AUTO_NORMAL          = 0x0D80;
	public static final int GL_MAP1_COLOR_4         = 0x0D90;
	public static final int GL_MAP1_GRID_DOMAIN     = 0x0DD0;
	public static final int GL_MAP1_GRID_SEGMENTS   = 0x0DD1;
	public static final int GL_MAP1_INDEX           = 0x0D91;
	public static final int GL_MAP1_NORMAL          = 0x0D92;
	public static final int GL_MAP1_TEXTURE_COORD_1 = 0x0D93;
	public static final int GL_MAP1_TEXTURE_COORD_2 = 0x0D94;
	public static final int GL_MAP1_TEXTURE_COORD_3 = 0x0D95;
	public static final int GL_MAP1_TEXTURE_COORD_4 = 0x0D96;
	public static final int GL_MAP1_VERTEX_3        = 0x0D97;
	public static final int GL_MAP1_VERTEX_4        = 0x0D98;
	public static final int GL_MAP2_COLOR_4         = 0x0DB0;
	public static final int GL_MAP2_GRID_DOMAIN     = 0x0DD2;
	public static final int GL_MAP2_GRID_SEGMENTS   = 0x0DD3;
	public static final int GL_MAP2_INDEX           = 0x0DB1;
	public static final int GL_MAP2_NORMAL          = 0x0DB2;
	public static final int GL_MAP2_TEXTURE_COORD_1 = 0x0DB3;
	public static final int GL_MAP2_TEXTURE_COORD_2 = 0x0DB4;
	public static final int GL_MAP2_TEXTURE_COORD_3 = 0x0DB5;
	public static final int GL_MAP2_TEXTURE_COORD_4 = 0x0DB6;
	public static final int GL_MAP2_VERTEX_3        = 0x0DB7;
	public static final int GL_MAP2_VERTEX_4        = 0x0DB8;
	public static final int GL_COEFF                = 0x0A00;
	public static final int GL_DOMAIN               = 0x0A02;
	public static final int GL_ORDER                = 0x0A01;

	public static final int GL_FOG_HINT                    = 0x0C54;
	public static final int GL_LINE_SMOOTH_HINT            = 0x0C52;
	public static final int GL_PERSPECTIVE_CORRECTION_HINT = 0x0C50;
	public static final int GL_POINT_SMOOTH_HINT           = 0x0C51;
	public static final int GL_POLYGON_SMOOTH_HINT         = 0x0C53;
	public static final int GL_DONT_CARE                   = 0x1100;
	public static final int GL_FASTEST                     = 0x1101;
	public static final int GL_NICEST                      = 0x1102;

	public static final int GL_SCISSOR_TEST = 0x0C11;
	public static final int GL_SCISSOR_BOX  = 0x0C10;

	public static final int GL_MAP_COLOR             = 0x0D10;
	public static final int GL_MAP_STENCIL           = 0x0D11;
	public static final int GL_INDEX_SHIFT           = 0x0D12;
	public static final int GL_INDEX_OFFSET          = 0x0D13;
	public static final int GL_RED_SCALE             = 0x0D14;
	public static final int GL_RED_BIAS              = 0x0D15;
	public static final int GL_GREEN_SCALE           = 0x0D18;
	public static final int GL_GREEN_BIAS            = 0x0D19;
	public static final int GL_BLUE_SCALE            = 0x0D1A;
	public static final int GL_BLUE_BIAS             = 0x0D1B;
	public static final int GL_ALPHA_SCALE           = 0x0D1C;
	public static final int GL_ALPHA_BIAS            = 0x0D1D;
	public static final int GL_DEPTH_SCALE           = 0x0D1E;
	public static final int GL_DEPTH_BIAS            = 0x0D1F;
	public static final int GL_PIXEL_MAP_S_TO_S_SIZE = 0x0CB1;
	public static final int GL_PIXEL_MAP_I_TO_I_SIZE = 0x0CB0;
	public static final int GL_PIXEL_MAP_I_TO_R_SIZE = 0x0CB2;
	public static final int GL_PIXEL_MAP_I_TO_G_SIZE = 0x0CB3;
	public static final int GL_PIXEL_MAP_I_TO_B_SIZE = 0x0CB4;
	public static final int GL_PIXEL_MAP_I_TO_A_SIZE = 0x0CB5;
	public static final int GL_PIXEL_MAP_R_TO_R_SIZE = 0x0CB6;
	public static final int GL_PIXEL_MAP_G_TO_G_SIZE = 0x0CB7;
	public static final int GL_PIXEL_MAP_B_TO_B_SIZE = 0x0CB8;
	public static final int GL_PIXEL_MAP_A_TO_A_SIZE = 0x0CB9;
	public static final int GL_PIXEL_MAP_S_TO_S      = 0x0C71;
	public static final int GL_PIXEL_MAP_I_TO_I      = 0x0C70;
	public static final int GL_PIXEL_MAP_I_TO_R      = 0x0C72;
	public static final int GL_PIXEL_MAP_I_TO_G      = 0x0C73;
	public static final int GL_PIXEL_MAP_I_TO_B      = 0x0C74;
	public static final int GL_PIXEL_MAP_I_TO_A      = 0x0C75;
	public static final int GL_PIXEL_MAP_R_TO_R      = 0x0C76;
	public static final int GL_PIXEL_MAP_G_TO_G      = 0x0C77;
	public static final int GL_PIXEL_MAP_B_TO_B      = 0x0C78;
	public static final int GL_PIXEL_MAP_A_TO_A      = 0x0C79;
	public static final int GL_PACK_ALIGNMENT        = 0x0D05;
	public static final int GL_PACK_LSB_FIRST        = 0x0D01;
	public static final int GL_PACK_ROW_LENGTH       = 0x0D02;
	public static final int GL_PACK_SKIP_PIXELS      = 0x0D04;
	public static final int GL_PACK_SKIP_ROWS        = 0x0D03;
	public static final int GL_PACK_SWAP_BYTES       = 0x0D00;
	public static final int GL_UNPACK_ALIGNMENT      = 0x0CF5;
	public static final int GL_UNPACK_LSB_FIRST      = 0x0CF1;
	public static final int GL_UNPACK_ROW_LENGTH     = 0x0CF2;
	public static final int GL_UNPACK_SKIP_PIXELS    = 0x0CF4;
	public static final int GL_UNPACK_SKIP_ROWS      = 0x0CF3;
	public static final int GL_UNPACK_SWAP_BYTES     = 0x0CF0;
	public static final int GL_ZOOM_X                = 0x0D16;
	public static final int GL_ZOOM_Y                = 0x0D17;

	/* Texture mapping */
	public static final int GL_TEXTURE_ENV            = 0x2300;
	public static final int GL_TEXTURE_ENV_MODE       = 0x2200;
	public static final int GL_TEXTURE_1D             = 0x0DE0;
	public static final int GL_TEXTURE_2D             = 0x0DE1;
	public static final int GL_TEXTURE_WRAP_S         = 0x2802;
	public static final int GL_TEXTURE_WRAP_T         = 0x2803;
	public static final int GL_TEXTURE_MAG_FILTER     = 0x2800;
	public static final int GL_TEXTURE_MIN_FILTER     = 0x2801;
	public static final int GL_TEXTURE_ENV_COLOR      = 0x2201;
	public static final int GL_TEXTURE_GEN_S          = 0x0C60;
	public static final int GL_TEXTURE_GEN_T          = 0x0C61;
	public static final int GL_TEXTURE_GEN_MODE       = 0x2500;
	public static final int GL_TEXTURE_BORDER_COLOR   = 0x1004;
	public static final int GL_TEXTURE_WIDTH          = 0x1000;
	public static final int GL_TEXTURE_HEIGHT         = 0x1001;
	public static final int GL_TEXTURE_BORDER         = 0x1005;
	public static final int GL_TEXTURE_COMPONENTS     = 0x1003;
	public static final int GL_TEXTURE_RED_SIZE       = 0x805C;
	public static final int GL_TEXTURE_GREEN_SIZE     = 0x805D;
	public static final int GL_TEXTURE_BLUE_SIZE      = 0x805E;
	public static final int GL_TEXTURE_ALPHA_SIZE     = 0x805F;
	public static final int GL_TEXTURE_LUMINANCE_SIZE = 0x8060;
	public static final int GL_TEXTURE_INTENSITY_SIZE = 0x8061;
	public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
	public static final int GL_NEAREST_MIPMAP_LINEAR  = 0x2702;
	public static final int GL_LINEAR_MIPMAP_NEAREST  = 0x2701;
	public static final int GL_LINEAR_MIPMAP_LINEAR   = 0x2703;
	public static final int GL_OBJECT_LINEAR          = 0x2401;
	public static final int GL_OBJECT_PLANE           = 0x2501;
	public static final int GL_EYE_LINEAR             = 0x2400;
	public static final int GL_EYE_PLANE              = 0x2502;
	public static final int GL_SPHERE_MAP             = 0x2402;
	public static final int GL_DECAL                  = 0x2101;
	public static final int GL_MODULATE               = 0x2100;
	public static final int GL_NEAREST                = 0x2600;
	public static final int GL_REPEAT                 = 0x2901;
	public static final int GL_CLAMP                  = 0x2900;
	public static final int GL_S                      = 0x2000;
	public static final int GL_T                      = 0x2001;
	public static final int GL_R                      = 0x2002;
	public static final int GL_Q                      = 0x2003;
	public static final int GL_TEXTURE_GEN_R          = 0x0C62;
	public static final int GL_TEXTURE_GEN_Q          = 0x0C63;

	public static final int GL_VENDOR     = 0x1F00;
	public static final int GL_RENDERER   = 0x1F01;
	public static final int GL_VERSION    = 0x1F02;
	public static final int GL_EXTENSIONS = 0x1F03;

	public static final int GL_NO_ERROR          = 0x0;
	public static final int GL_INVALID_VALUE     = 0x0501;
	public static final int GL_INVALID_ENUM      = 0x0500;
	public static final int GL_INVALID_OPERATION = 0x0502;
	public static final int GL_STACK_OVERFLOW    = 0x0503;
	public static final int GL_STACK_UNDERFLOW   = 0x0504;
	public static final int GL_OUT_OF_MEMORY     = 0x0505;

	public static final int GL_CURRENT_BIT         = 0x00000001;
	public static final int GL_POINT_BIT           = 0x00000002;
	public static final int GL_LINE_BIT            = 0x00000004;
	public static final int GL_POLYGON_BIT         = 0x00000008;
	public static final int GL_POLYGON_STIPPLE_BIT = 0x00000010;
	public static final int GL_PIXEL_MODE_BIT      = 0x00000020;
	public static final int GL_LIGHTING_BIT        = 0x00000040;
	public static final int GL_FOG_BIT             = 0x00000080;
	public static final int GL_DEPTH_BUFFER_BIT    = 0x00000100;
	public static final int GL_ACCUM_BUFFER_BIT    = 0x00000200;
	public static final int GL_STENCIL_BUFFER_BIT  = 0x00000400;
	public static final int GL_VIEWPORT_BIT        = 0x00000800;
	public static final int GL_TRANSFORM_BIT       = 0x00001000;
	public static final int GL_ENABLE_BIT          = 0x00002000;
	public static final int GL_COLOR_BUFFER_BIT    = 0x00004000;
	public static final int GL_HINT_BIT            = 0x00008000;
	public static final int GL_EVAL_BIT            = 0x00010000;
	public static final int GL_LIST_BIT            = 0x00020000;
	public static final int GL_TEXTURE_BIT         = 0x00040000;
	public static final int GL_SCISSOR_BIT         = 0x00080000;
	public static final int GL_ALL_ATTRIB_BITS     = 0x000FFFFF;

	public static final int GL_PROXY_TEXTURE_1D        = 0x8063;
	public static final int GL_PROXY_TEXTURE_2D        = 0x8064;
	public static final int GL_TEXTURE_PRIORITY        = 0x8066;
	public static final int GL_TEXTURE_RESIDENT        = 0x8067;
	public static final int GL_TEXTURE_BINDING_1D      = 0x8068;
	public static final int GL_TEXTURE_BINDING_2D      = 0x8069;
	public static final int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
	public static final int GL_ALPHA4                  = 0x803B;
	public static final int GL_ALPHA8                  = 0x803C;
	public static final int GL_ALPHA12                 = 0x803D;
	public static final int GL_ALPHA16                 = 0x803E;
	public static final int GL_LUMINANCE4              = 0x803F;
	public static final int GL_LUMINANCE8              = 0x8040;
	public static final int GL_LUMINANCE12             = 0x8041;
	public static final int GL_LUMINANCE16             = 0x8042;
	public static final int GL_LUMINANCE4_ALPHA4       = 0x8043;
	public static final int GL_LUMINANCE6_ALPHA2       = 0x8044;
	public static final int GL_LUMINANCE8_ALPHA8       = 0x8045;
	public static final int GL_LUMINANCE12_ALPHA4      = 0x8046;
	public static final int GL_LUMINANCE12_ALPHA12     = 0x8047;
	public static final int GL_LUMINANCE16_ALPHA16     = 0x8048;
	public static final int GL_INTENSITY               = 0x8049;
	public static final int GL_INTENSITY4              = 0x804A;
	public static final int GL_INTENSITY8              = 0x804B;
	public static final int GL_INTENSITY12             = 0x804C;
	public static final int GL_INTENSITY16             = 0x804D;
	public static final int GL_R3_G3_B2                = 0x2A10;
	public static final int GL_RGB4                    = 0x804F;
	public static final int GL_RGB5                    = 0x8050;
	public static final int GL_RGB8                    = 0x8051;
	public static final int GL_RGB10                   = 0x8052;
	public static final int GL_RGB12                   = 0x8053;
	public static final int GL_RGB16                   = 0x8054;
	public static final int GL_RGBA2                   = 0x8055;
	public static final int GL_RGBA4                   = 0x8056;
	public static final int GL_RGB5_A1                 = 0x8057;
	public static final int GL_RGBA8                   = 0x8058;
	public static final int GL_RGB10_A2                = 0x8059;
	public static final int GL_RGBA12                  = 0x805A;
	public static final int GL_RGBA16                  = 0x805B;
	public static final int GL_CLIENT_PIXEL_STORE_BIT  = 0x00000001;
	public static final int GL_CLIENT_VERTEX_ARRAY_BIT = 0x00000002;
	public static final int GL_ALL_CLIENT_ATTRIB_BITS  = 0xFFFFFFFF;
	public static final int GL_CLIENT_ALL_ATTRIB_BITS  = 0xFFFFFFFF;

	// type mapping
	// GLenum -> int
	// GLboolean -> boolean
	// GLbitfield -> int
	// GLvoid -> void
	// GLbyte -> byte
	// GLshort -> short
	// GLint -> int
	// GLubyte -> byte
	// GLushort -> short
	// GLuint -> int
	// GLsizei -> int
	// GLfloat -> float
	// GLclampf -> float
	// GLdouble -> double
	// GLclampd -> double

	public static native void glClearIndex(float c);
	public static native void glClearColor(float red, float green, float blue, float alpha);
	public static native void glClear(int mask);
	public static native void glIndexMask(int mask);
	public static native void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);
	public static native void glAlphaFunc(int func, float ref);
	public static native void glBlendFunc(int sfactor, int dfactor);
	public static native void glLogicOp(int opcode);
	public static native void glCullFace(int mode);
	public static native void glFrontFace(int mode);
	public static native void glPointSize(float size);
	public static native void glLineWidth(float width);
	public static native void glLineStipple(int factor, short pattern);
	public static native void glPolygonMode(int face, int mode);
	public static native void glPolygonOffset(float factor, float units);
	public static native void glPolygonStipple(Buffer mask); // ubyte * mask
	public static native void glGetPolygonStipple(Buffer mask); // void * mask
	public static native void glEdgeFlag(boolean flag);
	public static native void glEdgeFlagv(Buffer flag); // boolean * flag
	public static native void glScissor(int x, int y, int width, int height);
	public static native void glClipPlane(int plane, Buffer equation); // double equation[4]
	public static native void glGetClipPlane(int plane, Buffer equation); // double equation[4]
	public static native void glDrawBuffer(int mode);
	public static native void glReadBuffer(int mode);
	public static native void glEnable(int cap);
	public static native void glDisable(int cap);
	public static native boolean glIsEnabled(int cap);
	public static native void glEnableClientState(int cap);
	public static native void glDisableClientState(int cap);
	public static native void glGetBooleanv(int pname, Buffer params); // boolean * params
	public static native void glGetDoublev(int pname, Buffer params); // double * params
	public static native void glGetFloatv(int pname, Buffer params); // float * params
	public static native void glGetIntegerv(int pname, Buffer params); // int * params
	public static native void glPushAttrib(int mask);
	public static native void glPopAttrib();
	public static native void glPushClientAttrib(int mask);
	public static native void glPopClientAttrib();
	public static native int glRenderMode(int mode);
	public static native int glGetError();
	public static native String glGetString(int name);
	public static native void glFinish();
	public static native void glFlush();
	public static native void glHint(int target, int mode);

	public static native void glClearDepth(double depth);
	public static native void glDepthFunc(int func);
	public static native void glDepthMask(boolean flag);
	public static native void glDepthRange(double near_val, double far_val);

	public static native void glClearAccum(float red, float green, float blue, float alpha);
	public static native void glAccum(int op, float value);

	public static native void glMatrixMode(int mode);
	public static native void glOrtho(double left, double right, double bottom, double top, double near_val, double far_val);
	public static native void glFrustum(double left, double right, double bottom, double top, double near_val, double far_val);
	public static native void glViewport(int x, int y, int width, int height);
	public static native void glPushMatrix();
	public static native void glPopMatrix();
	public static native void glLoadIdentity();
	public static native void glLoadMatrixd(Buffer m); // double m[16]
	public static native void glLoadMatrixf(Buffer m); // float m[16]
	public static native void glMultMatrixd(Buffer m); // double m[16]
	public static native void glMultMatrixf(Buffer m); // float m[16]
	public static native void glRotated(double angle, double x, double y, double z);
	public static native void glRotatef(float angle, float x, float y, float z);
	public static native void glScaled(double x, double y, double z);
	public static native void glScalef(float x, float y, float z);
	public static native void glTranslated(double x, double y, double z);
	public static native void glTranslatef(float x, float y, float z);

	public static native boolean glIsList(int list);
	public static native void glDeleteLists(int list, int range);
	public static native int glGenLists(int range);
	public static native void glNewList(int list, int mode);
	public static native void glEndList();
	public static native void glCallList(int list);
	public static native void glCallLists(int n, int type, Buffer lists);
	public static native void glListBase(int base);

	public static native void glBegin(int mode);
	public static native void glEnd();
	public static native void glVertex2d(double x, double y);
	public static native void glVertex2f(float x, float y);
	public static native void glVertex2i(int x, int y);
	public static native void glVertex2s(short x, short y);
	public static native void glVertex3d(double x, double y, double z);
	public static native void glVertex3f(float x, float y, float z);
	public static native void glVertex3i(int x, int y, int z);
	public static native void glVertex3s(short x, short y, short z);
	public static native void glVertex4d(double x, double y, double z, double w);
	public static native void glVertex4f(float x, float y, float z, float w);
	public static native void glVertex4i(int x, int y, int z, int w);
	public static native void glVertex4s(short x, short y, short z, short w);
	public static native void glVertex2dv(Buffer v); // double v[2]
	public static native void glVertex2fv(Buffer v); // float v[2]
	public static native void glVertex2iv(Buffer v); // int v[2]
	public static native void glVertex2sv(Buffer v); // short v[2]
	public static native void glVertex3dv(Buffer v); // double v[3]
	public static native void glVertex3fv(Buffer v); // float v[3]
	public static native void glVertex3iv(Buffer v); // int v[3]
	public static native void glVertex3sv(Buffer v); // short v[3]
	public static native void glVertex4dv(Buffer v); // double v[4]
	public static native void glVertex4fv(Buffer v); // float v[4]
	public static native void glVertex4iv(Buffer v); // int v[4]
	public static native void glVertex4sv(Buffer v); // short v[4]
	public static native void glNormal3b(byte nx, byte ny, byte nz);
	public static native void glNormal3d(double nx, double ny, double nz);
	public static native void glNormal3f(float nx, float ny, float nz);
	public static native void glNormal3i(int nx, int ny, int nz);
	public static native void glNormal3s(short nx, short ny, short nz);
	public static native void glNormal3bv(Buffer v); // byte v[3]
	public static native void glNormal3dv(Buffer v); // double v[3]
	public static native void glNormal3fv(Buffer v); // float v[3]
	public static native void glNormal3iv(Buffer v); // int v[3]
	public static native void glNormal3sv(Buffer v); // short v[3]
	public static native void glIndexd(double c);
	public static native void glIndexf(float c);
	public static native void glIndexi(int c);
	public static native void glIndexs(short c);
	public static native void glIndexub(byte c);
	public static native void glIndexdv(Buffer c);
	public static native void glIndexfv(Buffer c);
	public static native void glIndexiv(Buffer c);
	public static native void glIndexsv(Buffer c);
	public static native void glIndexubv(Buffer c);
	public static native void glColor3b(byte red, byte green, byte blue);
	public static native void glColor3d(double red, double green, double blue);
	public static native void glColor3f(float red, float green, float blue);
	public static native void glColor3i(int red, int green, int blue);
	public static native void glColor3s(short red, short green, short blue);
	public static native void glColor3ub(byte red, byte green, byte blue);
	public static native void glColor3ui(int red, int green, int blue);
	public static native void glColor3us(short red, short green, short blue);
	public static native void glColor4b(byte red, byte green, byte blue, byte alpha);
	public static native void glColor4d(double red, double green, double blue, double alpha);
	public static native void glColor4f(float red, float green, float blue, float alpha);
	public static native void glColor4i(int red, int green, int blue, int alpha);
	public static native void glColor4s(short red, short green, short blue, short alpha);
	public static native void glColor4ub(byte red, byte green, byte blue, byte alpha);
	public static native void glColor4ui(int red, int green, int blue, int alpha);
	public static native void glColor4us(short red, short green, short blue, short alpha);
	public static native void glColor3bv(Buffer v);
	public static native void glColor3dv(Buffer v);
	public static native void glColor3fv(Buffer v);
	public static native void glColor3iv(Buffer v);
	public static native void glColor3sv(Buffer v);
	public static native void glColor3ubv(Buffer v);
	public static native void glColor3uiv(Buffer v);
	public static native void glColor3usv(Buffer v);
	public static native void glColor4bv(Buffer v);
	public static native void glColor4dv(Buffer v);
	public static native void glColor4fv(Buffer v);
	public static native void glColor4iv(Buffer v);
	public static native void glColor4sv(Buffer v);
	public static native void glColor4ubv(Buffer v);
	public static native void glColor4uiv(Buffer v);
	public static native void glColor4usv(Buffer v);
	public static native void glTexCoord1d(double s);
	public static native void glTexCoord1f(float s);
	public static native void glTexCoord1i(int s);
	public static native void glTexCoord1s(short s);
	public static native void glTexCoord2d(double s, double t);
	public static native void glTexCoord2f(float s, float t);
	public static native void glTexCoord2i(int s, int t);
	public static native void glTexCoord2s(short s, short t);
	public static native void glTexCoord3d(double s, double t, double r);
	public static native void glTexCoord3f(float s, float t, float r);
	public static native void glTexCoord3i(int s, int t, int r);
	public static native void glTexCoord3s(short s, short t, short r);
	public static native void glTexCoord4d(double s, double t, double r, double q);
	public static native void glTexCoord4f(float s, float t, float r, float q);
	public static native void glTexCoord4i(int s, int t, int r, int q);
	public static native void glTexCoord4s(short s, short t, short r, short q);
	public static native void glTexCoord1dv(Buffer v);
	public static native void glTexCoord1fv(Buffer v);
	public static native void glTexCoord1iv(Buffer v);
	public static native void glTexCoord1sv(Buffer v);
	public static native void glTexCoord2dv(Buffer v);
	public static native void glTexCoord2fv(Buffer v);
	public static native void glTexCoord2iv(Buffer v);
	public static native void glTexCoord2sv(Buffer v);
	public static native void glTexCoord3dv(Buffer v);
	public static native void glTexCoord3fv(Buffer v);
	public static native void glTexCoord3iv(Buffer v);
	public static native void glTexCoord3sv(Buffer v);
	public static native void glTexCoord4dv(Buffer v);
	public static native void glTexCoord4fv(Buffer v);
	public static native void glTexCoord4iv(Buffer v);
	public static native void glTexCoord4sv(Buffer v);
	public static native void glRasterPos2d(double x, double y);
	public static native void glRasterPos2f(float x, float y);
	public static native void glRasterPos2i(int x, int y);
	public static native void glRasterPos2s(short x, short y);
	public static native void glRasterPos3d(double x, double y, double z);
	public static native void glRasterPos3f(float x, float y, float z);
	public static native void glRasterPos3i(int x, int y, int z);
	public static native void glRasterPos3s(short x, short y, short z);
	public static native void glRasterPos4d(double x, double y, double z, double w);
	public static native void glRasterPos4f(float x, float y, float z, float w);
	public static native void glRasterPos4i(int x, int y, int z, int w);
	public static native void glRasterPos4s(short x, short y, short z, short w);
	public static native void glRasterPos2dv(Buffer v);
	public static native void glRasterPos2fv(Buffer v);
	public static native void glRasterPos2iv(Buffer v);
	public static native void glRasterPos2sv(Buffer v);
	public static native void glRasterPos3dv(Buffer v);
	public static native void glRasterPos3fv(Buffer v);
	public static native void glRasterPos3iv(Buffer v);
	public static native void glRasterPos3sv(Buffer v);
	public static native void glRasterPos4dv(Buffer v);
	public static native void glRasterPos4fv(Buffer v);
	public static native void glRasterPos4iv(Buffer v);
	public static native void glRasterPos4sv(Buffer v);
	public static native void glRectd(double x1, double y1, double x2, double y2);
	public static native void glRectf(float x1, float y1, float x2, float y2);
	public static native void glRecti(int x1, int y1, int x2, int y2);
	public static native void glRects(short x1, short y1, short x2, short y2);
	public static native void glRectdv(Buffer v1, Buffer v2);
	public static native void glRectfv(Buffer v1, Buffer v2);
	public static native void glRectiv(Buffer v1, Buffer v2);
	public static native void glRectsv(Buffer v1, Buffer v2);

	public static native void glShadeModel(int mode);
	public static native void glLightf(int light, int pname, float param);
	public static native void glLighti(int light, int pname, int param);
	public static native void glLightfv(int light, int pname, Buffer params);
	public static native void glLightiv(int light, int pname, Buffer params);
	public static native void glGetLightfv(int light, int pname, Buffer params);
	public static native void glGetLightiv(int light, int pname, Buffer params);
	public static native void glLightModelf(int pname, float param);
	public static native void glLightModeli(int pname, int param);
	public static native void glLightModelfv(int pname, Buffer params);
	public static native void glLightModeliv(int pname, Buffer params);
	public static native void glMaterialf(int face, int pname, float param);
	public static native void glMateriali(int face, int pname, int param);
	public static native void glMaterialfv(int face, int pname, Buffer params);
	public static native void glMaterialiv(int face, int pname, Buffer params);
	public static native void glGetMaterialfv(int face, int pname, Buffer params);
	public static native void glGetMaterialiv(int face, int pname, Buffer params);
	public static native void glColorMaterial(int face, int mode);

	public static native void glPixelZoom(float xfactor, float yfactor);
	public static native void glPixelStoref(int pname, float param);
	public static native void glPixelStorei(int pname, int param);
	public static native void glPixelTransferf(int pname, float param);
	public static native void glPixelTransferi(int pname, int param);
	public static native void glPixelMapfv(int map, int mapsize, Buffer values);
	public static native void glPixelMapuiv(int map, int mapsize, Buffer values);
	public static native void glPixelMapusv(int map, int mapsize, Buffer values);
	public static native void glGetPixelMapfv(int map, Buffer values);
	public static native void glGetPixelMapuiv(int map, Buffer values);
	public static native void glGetPixelMapusv(int map, Buffer values);
	public static native void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, Buffer bitmap);
	public static native void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels);
	public static native void glDrawPixels(int width, int height, int format, int type, Buffer pixels);
	public static native void glCopyPixels(int x, int y, int width, int height, int type);

	public static native void glStencilFunc(int func, int ref, int mask);
	public static native void glStencilMask(int mask);
	public static native void glStencilOp(int fail, int zfail, int zpass);
	public static native void glClearStencil(int s);

	public static native void glTexGend(int coord, int pname, double param);
	public static native void glTexGenf(int coord, int pname, float param);
	public static native void glTexGeni(int coord, int pname, int param);
	public static native void glTexGendv(int coord, int pname, Buffer params);
	public static native void glTexGenfv(int coord, int pname, Buffer params);
	public static native void glTexGeniv(int coord, int pname, Buffer params);
	public static native void glGetTexGendv(int coord, int pname, Buffer params);
	public static native void glGetTexGenfv(int coord, int pname, Buffer params);
	public static native void glGetTexGeniv(int coord, int pname, Buffer params);
	public static native void glTexEnvf(int target, int pname, float param);
	public static native void glTexEnvi(int target, int pname, int param);
	public static native void glTexEnvfv(int target, int pname, Buffer params);
	public static native void glTexEnviv(int target, int pname, Buffer params);
	public static native void glGetTexEnvfv(int target, int pname, Buffer params);
	public static native void glGetTexEnviv(int target, int pname, Buffer params);
	public static native void glTexParameterf(int target, int pname, float param);
	public static native void glTexParameteri(int target, int pname, int param);
	public static native void glTexParameterfv(int target, int pname, Buffer params);
	public static native void glTexParameteriv(int target, int pname, Buffer params);
	public static native void glGetTexParameterfv(int target, int pname, Buffer params);
	public static native void glGetTexParameteriv(int target, int pname, Buffer params);
	public static native void glGetTexLevelParameterfv(int target, int level, int pname, Buffer params);
	public static native void glGetTexLevelParameteriv(int target, int level, int pname, Buffer params);
	public static native void glTexImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, Buffer pixels);
	public static native void glTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, Buffer pixels);
	public static native void glGetTexImage(int target, int level, int format, int type, Buffer pixels);

	public static native void glMap1d(int target, double u1, double u2, int stride, int order, Buffer points);
	public static native void glMap1f(int target, float u1, float u2, int stride, int order, Buffer points);
	public static native void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, Buffer points);
	public static native void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, Buffer points);
	public static native void glGetMapdv(int target, int query, Buffer v);
	public static native void glGetMapfv(int target, int query, Buffer v);
	public static native void glGetMapiv(int target, int query, Buffer v);
	public static native void glEvalCoord1d(double u);
	public static native void glEvalCoord1f(float u);
	public static native void glEvalCoord1dv(Buffer u);
	public static native void glEvalCoord1fv(Buffer u);
	public static native void glEvalCoord2d(double u, double v);
	public static native void glEvalCoord2f(float u, float v);
	public static native void glEvalCoord2dv(Buffer u);
	public static native void glEvalCoord2fv(Buffer u);
	public static native void glMapGrid1d(int un, double u1, double u2);
	public static native void glMapGrid1f(int un, float u1, float u2);
	public static native void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2);
	public static native void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2);
	public static native void glEvalPoint1(int i);
	public static native void glEvalPoint2(int i, int j);
	public static native void glEvalMesh1(int mode, int i1, int i2);
	public static native void glEvalMesh2(int mode, int i1, int i2, int j1, int j2);

	public static native void glFogf(int pname, float param);
	public static native void glFogi(int pname, int param);
	public static native void glFogfv(int pname, Buffer params);
	public static native void glFogiv(int pname, Buffer params);

	public static native void glFeedbackBuffer(int size, int type, Buffer buffer);
	public static native void glPassThrough(float token);
	public static native void glSelectBuffer(int size, Buffer buffer);
	public static native void glInitNames();
	public static native void glLoadName(int name);
	public static native void glPushName(int name);
	public static native void glPopName();

	public static native void glGenTextures(int n, Buffer textures);
	public static native void glDeleteTextures(int n, Buffer textures);
	public static native void glBindTexture(int target, int texture);
	public static native void glPrioritizeTextures(int n, Buffer textures, Buffer priorities);
	public static native boolean glAreTexturesResident(int n, Buffer textures, Buffer residences);
	public static native boolean glIsTexture(int texture);

	public static native void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, Buffer pixels);
	public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Buffer pixels);
	public static native void glCopyTexImage1D(int target, int level, int internalformat, int x, int y, int width, int border);
	public static native void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border);
	public static native void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width);
	public static native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

	public static native void glVertexPointer(int size, int type, int stride, Buffer ptr);
	public static native void glNormalPointer(int type, int stride, Buffer ptr);
	public static native void glColorPointer(int size, int type, int stride, Buffer ptr);
	public static native void glIndexPointer(int type, int stride, Buffer ptr);
	public static native void glTexCoordPointer(int size, int type, int stride, Buffer ptr);
	public static native void glEdgeFlagPointer(int stride, Buffer ptr);
	public static native void glGetPointerv(int pname, Buffer params);
	public static native void glArrayElement(int i);
	public static native void glDrawArrays(int mode, int first, int count);
	public static native void glDrawElements(int mode, int count, int type, Buffer indices);
	public static native void glInterleavedArrays(int format, int stride, Buffer pointer);

}
