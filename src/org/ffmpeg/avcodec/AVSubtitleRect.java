package org.ffmpeg.avcodec;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avcodec.AvcodecLibrary.AVSubtitleType;
/**
 * <i>native declaration : ./libavcodec/avcodec.h:2479</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avcodec") 
public class AVSubtitleRect extends StructObject {
	static {
		BridJ.register();
	}
	/** < top left corner  of pict, undefined when pict is not set */
	@Field(0) 
	public int x() {
		return this.io.getIntField(this, 0);
	}
	/** < top left corner  of pict, undefined when pict is not set */
	@Field(0) 
	public AVSubtitleRect x(int x) {
		this.io.setIntField(this, 0, x);
		return this;
	}
	/** < top left corner  of pict, undefined when pict is not set */
	@Field(1) 
	public int y() {
		return this.io.getIntField(this, 1);
	}
	/** < top left corner  of pict, undefined when pict is not set */
	@Field(1) 
	public AVSubtitleRect y(int y) {
		this.io.setIntField(this, 1, y);
		return this;
	}
	/** < width            of pict, undefined when pict is not set */
	@Field(2) 
	public int w() {
		return this.io.getIntField(this, 2);
	}
	/** < width            of pict, undefined when pict is not set */
	@Field(2) 
	public AVSubtitleRect w(int w) {
		this.io.setIntField(this, 2, w);
		return this;
	}
	/** < height           of pict, undefined when pict is not set */
	@Field(3) 
	public int h() {
		return this.io.getIntField(this, 3);
	}
	/** < height           of pict, undefined when pict is not set */
	@Field(3) 
	public AVSubtitleRect h(int h) {
		this.io.setIntField(this, 3, h);
		return this;
	}
	/** < number of colors in pict, undefined when pict is not set */
	@Field(4) 
	public int nb_colors() {
		return this.io.getIntField(this, 4);
	}
	/** < number of colors in pict, undefined when pict is not set */
	@Field(4) 
	public AVSubtitleRect nb_colors(int nb_colors) {
		this.io.setIntField(this, 4, nb_colors);
		return this;
	}
	/**
	 * @deprecated unused<br>
	 * C type : AVPicture
	 */
	@Field(5) 
	public AVPicture pict() {
		return this.io.getNativeObjectField(this, 5);
	}
	/**
	 * @deprecated unused<br>
	 * C type : AVPicture
	 */
	@Field(5) 
	public AVSubtitleRect pict(AVPicture pict) {
		this.io.setNativeObjectField(this, 5, pict);
		return this;
	}
	/**
	 * data+linesize for the bitmap of this subtitle.<br>
	 * Can be set for text/ass as well once they are rendered.<br>
	 * C type : uint8_t*[4]
	 */
	@Array({4}) 
	@Field(6) 
	public Pointer<Pointer<Byte > > data() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : int[4] */
	@Array({4}) 
	@Field(7) 
	public Pointer<Integer > linesize() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : AVSubtitleType */
	@Field(8) 
	public IntValuedEnum<AVSubtitleType > type() {
		return this.io.getEnumField(this, 8);
	}
	/** C type : AVSubtitleType */
	@Field(8) 
	public AVSubtitleRect type(IntValuedEnum<AVSubtitleType > type) {
		this.io.setEnumField(this, 8, type);
		return this;
	}
	/**
	 * < 0 terminated plain UTF-8 text<br>
	 * C type : char*
	 */
	@Field(9) 
	public Pointer<Byte > text() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * < 0 terminated plain UTF-8 text<br>
	 * C type : char*
	 */
	@Field(9) 
	public AVSubtitleRect text(Pointer<Byte > text) {
		this.io.setPointerField(this, 9, text);
		return this;
	}
	/**
	 * 0 terminated ASS/SSA compatible event line.<br>
	 * The presentation of this is unaffected by the other values in this<br>
	 * struct.<br>
	 * C type : char*
	 */
	@Field(10) 
	public Pointer<Byte > ass() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * 0 terminated ASS/SSA compatible event line.<br>
	 * The presentation of this is unaffected by the other values in this<br>
	 * struct.<br>
	 * C type : char*
	 */
	@Field(10) 
	public AVSubtitleRect ass(Pointer<Byte > ass) {
		this.io.setPointerField(this, 10, ass);
		return this;
	}
	@Field(11) 
	public int flags() {
		return this.io.getIntField(this, 11);
	}
	@Field(11) 
	public AVSubtitleRect flags(int flags) {
		this.io.setIntField(this, 11, flags);
		return this;
	}
	public AVSubtitleRect() {
		super();
	}
	public AVSubtitleRect(Pointer pointer) {
		super(pointer);
	}
}
