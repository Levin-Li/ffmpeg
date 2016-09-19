package org.ffmpeg.avfilter;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : libavfilter/avfilter.h:543</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avfilter") 
public class AVFilterGraphInternal extends StructObject {
	static {
		BridJ.register();
	}
	@Field(0) 
	public int dummy() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public AVFilterGraphInternal dummy(int dummy) {
		this.io.setIntField(this, 0, dummy);
		return this;
	}
	public AVFilterGraphInternal() {
		super();
	}
	public AVFilterGraphInternal(Pointer pointer) {
		super(pointer);
	}
}
