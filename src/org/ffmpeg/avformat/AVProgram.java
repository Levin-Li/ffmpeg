package org.ffmpeg.avformat;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avcodec.AvcodecLibrary.AVDiscard;
import org.ffmpeg.avutil.AVDictionary;
/**
 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:181</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avformat") 
public class AVProgram extends StructObject {
	static {
		BridJ.register();
	}
	@Field(0) 
	public int id() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public AVProgram id(int id) {
		this.io.setIntField(this, 0, id);
		return this;
	}
	@Field(1) 
	public int flags() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public AVProgram flags(int flags) {
		this.io.setIntField(this, 1, flags);
		return this;
	}
	/**
	 * < selects which program to discard and which to feed to the caller<br>
	 * C type : AVDiscard
	 */
	@Field(2) 
	public IntValuedEnum<AVDiscard > discard() {
		return this.io.getEnumField(this, 2);
	}
	/**
	 * < selects which program to discard and which to feed to the caller<br>
	 * C type : AVDiscard
	 */
	@Field(2) 
	public AVProgram discard(IntValuedEnum<AVDiscard > discard) {
		this.io.setEnumField(this, 2, discard);
		return this;
	}
	/** C type : unsigned int* */
	@Field(3) 
	public Pointer<Integer > stream_index() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : unsigned int* */
	@Field(3) 
	public AVProgram stream_index(Pointer<Integer > stream_index) {
		this.io.setPointerField(this, 3, stream_index);
		return this;
	}
	@Field(4) 
	public int nb_stream_indexes() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public AVProgram nb_stream_indexes(int nb_stream_indexes) {
		this.io.setIntField(this, 4, nb_stream_indexes);
		return this;
	}
	/** C type : AVDictionary* */
	@Field(5) 
	public Pointer<AVDictionary > metadata() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : AVDictionary* */
	@Field(5) 
	public AVProgram metadata(Pointer<AVDictionary > metadata) {
		this.io.setPointerField(this, 5, metadata);
		return this;
	}
	@Field(6) 
	public int program_num() {
		return this.io.getIntField(this, 6);
	}
	@Field(6) 
	public AVProgram program_num(int program_num) {
		this.io.setIntField(this, 6, program_num);
		return this;
	}
	@Field(7) 
	public int pmt_pid() {
		return this.io.getIntField(this, 7);
	}
	@Field(7) 
	public AVProgram pmt_pid(int pmt_pid) {
		this.io.setIntField(this, 7, pmt_pid);
		return this;
	}
	@Field(8) 
	public int pcr_pid() {
		return this.io.getIntField(this, 8);
	}
	@Field(8) 
	public AVProgram pcr_pid(int pcr_pid) {
		this.io.setIntField(this, 8, pcr_pid);
		return this;
	}
	@Field(9) 
	public long start_time() {
		return this.io.getLongField(this, 9);
	}
	@Field(9) 
	public AVProgram start_time(long start_time) {
		this.io.setLongField(this, 9, start_time);
		return this;
	}
	@Field(10) 
	public long end_time() {
		return this.io.getLongField(this, 10);
	}
	@Field(10) 
	public AVProgram end_time(long end_time) {
		this.io.setLongField(this, 10, end_time);
		return this;
	}
	/** < reference dts for wrap detection */
	@Field(11) 
	public long pts_wrap_reference() {
		return this.io.getLongField(this, 11);
	}
	/** < reference dts for wrap detection */
	@Field(11) 
	public AVProgram pts_wrap_reference(long pts_wrap_reference) {
		this.io.setLongField(this, 11, pts_wrap_reference);
		return this;
	}
	/** < behavior on wrap detection */
	@Field(12) 
	public int pts_wrap_behavior() {
		return this.io.getIntField(this, 12);
	}
	/** < behavior on wrap detection */
	@Field(12) 
	public AVProgram pts_wrap_behavior(int pts_wrap_behavior) {
		this.io.setIntField(this, 12, pts_wrap_behavior);
		return this;
	}
	public AVProgram() {
		super();
	}
	public AVProgram(Pointer pointer) {
		super(pointer);
	}
}
