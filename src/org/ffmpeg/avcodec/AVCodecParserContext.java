package org.ffmpeg.avcodec;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avcodec.AvcodecLibrary.AVFieldOrder;
import org.ffmpeg.avcodec.AvcodecLibrary.AVPictureStructure;
/**
 * <i>native declaration : ./libavcodec/avcodec.h:2784</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avcodec") 
public class AVCodecParserContext extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : void* */
	@Field(0) 
	public Pointer<? > priv_data() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : void* */
	@Field(0) 
	public AVCodecParserContext priv_data(Pointer<? > priv_data) {
		this.io.setPointerField(this, 0, priv_data);
		return this;
	}
	/** C type : AVCodecParser* */
	@Field(1) 
	public Pointer<AVCodecParser > parser() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : AVCodecParser* */
	@Field(1) 
	public AVCodecParserContext parser(Pointer<AVCodecParser > parser) {
		this.io.setPointerField(this, 1, parser);
		return this;
	}
	/** offset of the current frame */
	@Field(2) 
	public long frame_offset() {
		return this.io.getLongField(this, 2);
	}
	/** offset of the current frame */
	@Field(2) 
	public AVCodecParserContext frame_offset(long frame_offset) {
		this.io.setLongField(this, 2, frame_offset);
		return this;
	}
	/**
	 * current offset<br>
	 * (incremented by each av_parser_parse())
	 */
	@Field(3) 
	public long cur_offset() {
		return this.io.getLongField(this, 3);
	}
	/**
	 * current offset<br>
	 * (incremented by each av_parser_parse())
	 */
	@Field(3) 
	public AVCodecParserContext cur_offset(long cur_offset) {
		this.io.setLongField(this, 3, cur_offset);
		return this;
	}
	/** offset of the next frame */
	@Field(4) 
	public long next_frame_offset() {
		return this.io.getLongField(this, 4);
	}
	/** offset of the next frame */
	@Field(4) 
	public AVCodecParserContext next_frame_offset(long next_frame_offset) {
		this.io.setLongField(this, 4, next_frame_offset);
		return this;
	}
	/**
	 * video info<br>
	 * XXX: Put it back in AVCodecContext.
	 */
	@Field(5) 
	public int pict_type() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * video info<br>
	 * XXX: Put it back in AVCodecContext.
	 */
	@Field(5) 
	public AVCodecParserContext pict_type(int pict_type) {
		this.io.setIntField(this, 5, pict_type);
		return this;
	}
	/**
	 * This field is used for proper frame duration computation in lavf.<br>
	 * It signals, how much longer the frame duration of the current frame<br>
	 * is compared to normal frame duration.<br>
	 * * frame_duration = (1 + repeat_pict) * time_base<br>
	 * * It is used by codecs like H.264 to display telecined material.<br>
	 * XXX: Put it back in AVCodecContext.
	 */
	@Field(6) 
	public int repeat_pict() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * This field is used for proper frame duration computation in lavf.<br>
	 * It signals, how much longer the frame duration of the current frame<br>
	 * is compared to normal frame duration.<br>
	 * * frame_duration = (1 + repeat_pict) * time_base<br>
	 * * It is used by codecs like H.264 to display telecined material.<br>
	 * XXX: Put it back in AVCodecContext.
	 */
	@Field(6) 
	public AVCodecParserContext repeat_pict(int repeat_pict) {
		this.io.setIntField(this, 6, repeat_pict);
		return this;
	}
	/** pts of the current frame */
	@Field(7) 
	public long pts() {
		return this.io.getLongField(this, 7);
	}
	/** pts of the current frame */
	@Field(7) 
	public AVCodecParserContext pts(long pts) {
		this.io.setLongField(this, 7, pts);
		return this;
	}
	/** dts of the current frame */
	@Field(8) 
	public long dts() {
		return this.io.getLongField(this, 8);
	}
	/** dts of the current frame */
	@Field(8) 
	public AVCodecParserContext dts(long dts) {
		this.io.setLongField(this, 8, dts);
		return this;
	}
	/** private data */
	@Field(9) 
	public long last_pts() {
		return this.io.getLongField(this, 9);
	}
	/** private data */
	@Field(9) 
	public AVCodecParserContext last_pts(long last_pts) {
		this.io.setLongField(this, 9, last_pts);
		return this;
	}
	@Field(10) 
	public long last_dts() {
		return this.io.getLongField(this, 10);
	}
	@Field(10) 
	public AVCodecParserContext last_dts(long last_dts) {
		this.io.setLongField(this, 10, last_dts);
		return this;
	}
	@Field(11) 
	public int fetch_timestamp() {
		return this.io.getIntField(this, 11);
	}
	@Field(11) 
	public AVCodecParserContext fetch_timestamp(int fetch_timestamp) {
		this.io.setIntField(this, 11, fetch_timestamp);
		return this;
	}
	@Field(12) 
	public int cur_frame_start_index() {
		return this.io.getIntField(this, 12);
	}
	@Field(12) 
	public AVCodecParserContext cur_frame_start_index(int cur_frame_start_index) {
		this.io.setIntField(this, 12, cur_frame_start_index);
		return this;
	}
	/** C type : int64_t[4] */
	@Array({4}) 
	@Field(13) 
	public Pointer<Long > cur_frame_offset() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : int64_t[4] */
	@Array({4}) 
	@Field(14) 
	public Pointer<Long > cur_frame_pts() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : int64_t[4] */
	@Array({4}) 
	@Field(15) 
	public Pointer<Long > cur_frame_dts() {
		return this.io.getPointerField(this, 15);
	}
	@Field(16) 
	public int flags() {
		return this.io.getIntField(this, 16);
	}
	@Field(16) 
	public AVCodecParserContext flags(int flags) {
		this.io.setIntField(this, 16, flags);
		return this;
	}
	/** < byte offset from starting packet start */
	@Field(17) 
	public long offset() {
		return this.io.getLongField(this, 17);
	}
	/** < byte offset from starting packet start */
	@Field(17) 
	public AVCodecParserContext offset(long offset) {
		this.io.setLongField(this, 17, offset);
		return this;
	}
	/** C type : int64_t[4] */
	@Array({4}) 
	@Field(18) 
	public Pointer<Long > cur_frame_end() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * Set by parser to 1 for key frames and 0 for non-key frames.<br>
	 * It is initialized to -1, so if the parser doesn't set this flag,<br>
	 * old-style fallback using AV_PICTURE_TYPE_I picture type as key frames<br>
	 * will be used.
	 */
	@Field(19) 
	public int key_frame() {
		return this.io.getIntField(this, 19);
	}
	/**
	 * Set by parser to 1 for key frames and 0 for non-key frames.<br>
	 * It is initialized to -1, so if the parser doesn't set this flag,<br>
	 * old-style fallback using AV_PICTURE_TYPE_I picture type as key frames<br>
	 * will be used.
	 */
	@Field(19) 
	public AVCodecParserContext key_frame(int key_frame) {
		this.io.setIntField(this, 19, key_frame);
		return this;
	}
	/**
	 * Time difference in stream time base units from the pts of this<br>
	 * packet to the point at which the output from the decoder has converged<br>
	 * independent from the availability of previous frames. That is, the<br>
	 * frames are virtually identical no matter if decoding started from<br>
	 * the very first frame or from this keyframe.<br>
	 * Is AV_NOPTS_VALUE if unknown.<br>
	 * This field is not the display duration of the current frame.<br>
	 * This field has no meaning if the packet does not have AV_PKT_FLAG_KEY<br>
	 * set.<br>
	 * * The purpose of this field is to allow seeking in streams that have no<br>
	 * keyframes in the conventional sense. It corresponds to the<br>
	 * recovery point SEI in H.264 and match_time_delta in NUT. It is also<br>
	 * essential for some types of subtitle streams to ensure that all<br>
	 * subtitles are correctly displayed after seeking.
	 */
	@Field(20) 
	public long convergence_duration() {
		return this.io.getLongField(this, 20);
	}
	/**
	 * Time difference in stream time base units from the pts of this<br>
	 * packet to the point at which the output from the decoder has converged<br>
	 * independent from the availability of previous frames. That is, the<br>
	 * frames are virtually identical no matter if decoding started from<br>
	 * the very first frame or from this keyframe.<br>
	 * Is AV_NOPTS_VALUE if unknown.<br>
	 * This field is not the display duration of the current frame.<br>
	 * This field has no meaning if the packet does not have AV_PKT_FLAG_KEY<br>
	 * set.<br>
	 * * The purpose of this field is to allow seeking in streams that have no<br>
	 * keyframes in the conventional sense. It corresponds to the<br>
	 * recovery point SEI in H.264 and match_time_delta in NUT. It is also<br>
	 * essential for some types of subtitle streams to ensure that all<br>
	 * subtitles are correctly displayed after seeking.
	 */
	@Field(20) 
	public AVCodecParserContext convergence_duration(long convergence_duration) {
		this.io.setLongField(this, 20, convergence_duration);
		return this;
	}
	/**
	 * Synchronization point for start of timestamp generation.<br>
	 * * Set to >0 for sync point, 0 for no sync point and <0 for undefined<br>
	 * (default).<br>
	 * * For example, this corresponds to presence of H.264 buffering period<br>
	 * SEI message.
	 */
	@Field(21) 
	public int dts_sync_point() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * Synchronization point for start of timestamp generation.<br>
	 * * Set to >0 for sync point, 0 for no sync point and <0 for undefined<br>
	 * (default).<br>
	 * * For example, this corresponds to presence of H.264 buffering period<br>
	 * SEI message.
	 */
	@Field(21) 
	public AVCodecParserContext dts_sync_point(int dts_sync_point) {
		this.io.setIntField(this, 21, dts_sync_point);
		return this;
	}
	/**
	 * Offset of the current timestamp against last timestamp sync point in<br>
	 * units of AVCodecContext.time_base.<br>
	 * * Set to INT_MIN when dts_sync_point unused. Otherwise, it must<br>
	 * contain a valid timestamp offset.<br>
	 * * Note that the timestamp of sync point has usually a nonzero<br>
	 * dts_ref_dts_delta, which refers to the previous sync point. Offset of<br>
	 * the next frame after timestamp sync point will be usually 1.<br>
	 * * For example, this corresponds to H.264 cpb_removal_delay.
	 */
	@Field(22) 
	public int dts_ref_dts_delta() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * Offset of the current timestamp against last timestamp sync point in<br>
	 * units of AVCodecContext.time_base.<br>
	 * * Set to INT_MIN when dts_sync_point unused. Otherwise, it must<br>
	 * contain a valid timestamp offset.<br>
	 * * Note that the timestamp of sync point has usually a nonzero<br>
	 * dts_ref_dts_delta, which refers to the previous sync point. Offset of<br>
	 * the next frame after timestamp sync point will be usually 1.<br>
	 * * For example, this corresponds to H.264 cpb_removal_delay.
	 */
	@Field(22) 
	public AVCodecParserContext dts_ref_dts_delta(int dts_ref_dts_delta) {
		this.io.setIntField(this, 22, dts_ref_dts_delta);
		return this;
	}
	/**
	 * Presentation delay of current frame in units of AVCodecContext.time_base.<br>
	 * * Set to INT_MIN when dts_sync_point unused. Otherwise, it must<br>
	 * contain valid non-negative timestamp delta (presentation time of a frame<br>
	 * must not lie in the past).<br>
	 * * This delay represents the difference between decoding and presentation<br>
	 * time of the frame.<br>
	 * * For example, this corresponds to H.264 dpb_output_delay.
	 */
	@Field(23) 
	public int pts_dts_delta() {
		return this.io.getIntField(this, 23);
	}
	/**
	 * Presentation delay of current frame in units of AVCodecContext.time_base.<br>
	 * * Set to INT_MIN when dts_sync_point unused. Otherwise, it must<br>
	 * contain valid non-negative timestamp delta (presentation time of a frame<br>
	 * must not lie in the past).<br>
	 * * This delay represents the difference between decoding and presentation<br>
	 * time of the frame.<br>
	 * * For example, this corresponds to H.264 dpb_output_delay.
	 */
	@Field(23) 
	public AVCodecParserContext pts_dts_delta(int pts_dts_delta) {
		this.io.setIntField(this, 23, pts_dts_delta);
		return this;
	}
	/**
	 * Position of the packet in file.<br>
	 * * Analogous to cur_frame_pts/dts<br>
	 * C type : int64_t[4]
	 */
	@Array({4}) 
	@Field(24) 
	public Pointer<Long > cur_frame_pos() {
		return this.io.getPointerField(this, 24);
	}
	/** Byte position of currently parsed frame in stream. */
	@Field(25) 
	public long pos() {
		return this.io.getLongField(this, 25);
	}
	/** Byte position of currently parsed frame in stream. */
	@Field(25) 
	public AVCodecParserContext pos(long pos) {
		this.io.setLongField(this, 25, pos);
		return this;
	}
	/** Previous frame byte position. */
	@Field(26) 
	public long last_pos() {
		return this.io.getLongField(this, 26);
	}
	/** Previous frame byte position. */
	@Field(26) 
	public AVCodecParserContext last_pos(long last_pos) {
		this.io.setLongField(this, 26, last_pos);
		return this;
	}
	/**
	 * Duration of the current frame.<br>
	 * For audio, this is in units of 1 / AVCodecContext.sample_rate.<br>
	 * For all other types, this is in units of AVCodecContext.time_base.
	 */
	@Field(27) 
	public int duration() {
		return this.io.getIntField(this, 27);
	}
	/**
	 * Duration of the current frame.<br>
	 * For audio, this is in units of 1 / AVCodecContext.sample_rate.<br>
	 * For all other types, this is in units of AVCodecContext.time_base.
	 */
	@Field(27) 
	public AVCodecParserContext duration(int duration) {
		this.io.setIntField(this, 27, duration);
		return this;
	}
	/** C type : AVFieldOrder */
	@Field(28) 
	public IntValuedEnum<AVFieldOrder > field_order() {
		return this.io.getEnumField(this, 28);
	}
	/** C type : AVFieldOrder */
	@Field(28) 
	public AVCodecParserContext field_order(IntValuedEnum<AVFieldOrder > field_order) {
		this.io.setEnumField(this, 28, field_order);
		return this;
	}
	/**
	 * Indicate whether a picture is coded as a frame, top field or bottom field.<br>
	 * * For example, H.264 field_pic_flag equal to 0 corresponds to<br>
	 * AV_PICTURE_STRUCTURE_FRAME. An H.264 picture with field_pic_flag<br>
	 * equal to 1 and bottom_field_flag equal to 0 corresponds to<br>
	 * AV_PICTURE_STRUCTURE_TOP_FIELD.<br>
	 * C type : AVPictureStructure
	 */
	@Field(29) 
	public IntValuedEnum<AVPictureStructure > picture_structure() {
		return this.io.getEnumField(this, 29);
	}
	/**
	 * Indicate whether a picture is coded as a frame, top field or bottom field.<br>
	 * * For example, H.264 field_pic_flag equal to 0 corresponds to<br>
	 * AV_PICTURE_STRUCTURE_FRAME. An H.264 picture with field_pic_flag<br>
	 * equal to 1 and bottom_field_flag equal to 0 corresponds to<br>
	 * AV_PICTURE_STRUCTURE_TOP_FIELD.<br>
	 * C type : AVPictureStructure
	 */
	@Field(29) 
	public AVCodecParserContext picture_structure(IntValuedEnum<AVPictureStructure > picture_structure) {
		this.io.setEnumField(this, 29, picture_structure);
		return this;
	}
	/**
	 * Picture number incremented in presentation or output order.<br>
	 * This field may be reinitialized at the first picture of a new sequence.<br>
	 * * For example, this corresponds to H.264 PicOrderCnt.
	 */
	@Field(30) 
	public int output_picture_number() {
		return this.io.getIntField(this, 30);
	}
	/**
	 * Picture number incremented in presentation or output order.<br>
	 * This field may be reinitialized at the first picture of a new sequence.<br>
	 * * For example, this corresponds to H.264 PicOrderCnt.
	 */
	@Field(30) 
	public AVCodecParserContext output_picture_number(int output_picture_number) {
		this.io.setIntField(this, 30, output_picture_number);
		return this;
	}
	/** Dimensions of the decoded video intended for presentation. */
	@Field(31) 
	public int width() {
		return this.io.getIntField(this, 31);
	}
	/** Dimensions of the decoded video intended for presentation. */
	@Field(31) 
	public AVCodecParserContext width(int width) {
		this.io.setIntField(this, 31, width);
		return this;
	}
	@Field(32) 
	public int height() {
		return this.io.getIntField(this, 32);
	}
	@Field(32) 
	public AVCodecParserContext height(int height) {
		this.io.setIntField(this, 32, height);
		return this;
	}
	/** Dimensions of the coded video. */
	@Field(33) 
	public int coded_width() {
		return this.io.getIntField(this, 33);
	}
	/** Dimensions of the coded video. */
	@Field(33) 
	public AVCodecParserContext coded_width(int coded_width) {
		this.io.setIntField(this, 33, coded_width);
		return this;
	}
	@Field(34) 
	public int coded_height() {
		return this.io.getIntField(this, 34);
	}
	@Field(34) 
	public AVCodecParserContext coded_height(int coded_height) {
		this.io.setIntField(this, 34, coded_height);
		return this;
	}
	/**
	 * The format of the coded data, corresponds to enum AVPixelFormat for video<br>
	 * and for enum AVSampleFormat for audio.<br>
	 * * Note that a decoder can have considerable freedom in how exactly it<br>
	 * decodes the data, so the format reported here might be different from the<br>
	 * one returned by a decoder.
	 */
	@Field(35) 
	public int format() {
		return this.io.getIntField(this, 35);
	}
	/**
	 * The format of the coded data, corresponds to enum AVPixelFormat for video<br>
	 * and for enum AVSampleFormat for audio.<br>
	 * * Note that a decoder can have considerable freedom in how exactly it<br>
	 * decodes the data, so the format reported here might be different from the<br>
	 * one returned by a decoder.
	 */
	@Field(35) 
	public AVCodecParserContext format(int format) {
		this.io.setIntField(this, 35, format);
		return this;
	}
	public AVCodecParserContext() {
		super();
	}
	public AVCodecParserContext(Pointer pointer) {
		super(pointer);
	}
}
