/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.azkfw.report;

/**
 * このクラスは、用紙サイズ情報を保持するクラスです。
 * 
 * @since 1.0.0
 * @version 1.0.0 2014/11/06
 * @author kawakicchi
 */
public class PaperSize {

	/** A1 */
	public static final PaperSize A1 = new PaperSize("A1", 594f, 841f);
	/** A2 */
	public static final PaperSize A2 = new PaperSize("A2", 420f, 594f);
	/** A3 */
	public static final PaperSize A3 = new PaperSize("A3", 297f, 420f);
	/** A4 */
	public static final PaperSize A4 = new PaperSize("A4", 210f, 297f);
	/** A5 */
	public static final PaperSize A5 = new PaperSize("A5", 148f, 210f);
	/** A6 */
	public static final PaperSize A6 = new PaperSize("A6", 105f, 148f);
	/** A7 */
	public static final PaperSize A7 = new PaperSize("A7", 74f, 105f);

	/** B1 */
	public static final PaperSize B1 = new PaperSize("B1", 728f, 1030f);
	/** B2 */
	public static final PaperSize B2 = new PaperSize("B2", 515f, 728f);
	/** B3 */
	public static final PaperSize B3 = new PaperSize("B3", 364f, 515f);
	/** B4 */
	public static final PaperSize B4 = new PaperSize("B4", 257f, 364f);
	/** B5 */
	public static final PaperSize B5 = new PaperSize("B5", 182f, 257f);
	/** B6 */
	public static final PaperSize B6 = new PaperSize("B6", 128f, 182f);
	/** B7 */
	public static final PaperSize B7 = new PaperSize("B7", 91f, 128f);

	/** 官製はがき */
	public static final PaperSize OFFICIAL_POSTCARD = new PaperSize("官製はがき", 100f, 148f);
	/** 写真（2L判） */
	public static final PaperSize PHOTO_2L = new PaperSize("写真（2L判）", 127f, 178f);
	/** 写真（L判） */
	public static final PaperSize PHOTO_L = new PaperSize("写真（L判）", 89f, 127f);
	/** 写真（E判） */
	public static final PaperSize PHOTO_E = new PaperSize("写真（E判）", 83f, 117f);
	/** 名刺 */
	public static final PaperSize BUSINESS_CARD = new PaperSize("名刺", 55f, 91f);

	private String name;
	private float shortWidth;
	private float longWidth;

	/**
	 * コンストラクタ
	 * 
	 * @param aName 名前
	 * @param aShortWidth 幅（短い） [mm]
	 * @param aLongWidth 幅(長い) [mm]
	 */
	public PaperSize(final String aName, final float aShortWidth, final float aLongWidth) {
		name = aName;
		shortWidth = aShortWidth;
		longWidth = aLongWidth;
	}

	/**
	 * 名前を取得する。
	 * 
	 * @return 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 幅（短い）を取得する。
	 * 
	 * @return 幅（短い） [mm]
	 */
	public float getShortWidth() {
		return shortWidth;
	}

	/**
	 * 幅（長い）を取得する。
	 * 
	 * @return 幅（長い） [mm]
	 */
	public float getLongWidth() {
		return longWidth;
	}
}
