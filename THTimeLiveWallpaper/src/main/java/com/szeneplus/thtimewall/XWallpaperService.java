package com.szeneplus.thtimewall;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;

import java.util.Calendar;

public class XWallpaperService extends WallpaperService {

	@Override
	public Engine onCreateEngine() {
		return new DemoWallpaperEngine();
	}
	
	private class DemoWallpaperEngine extends Engine {
		private boolean mVisible = false;
		private final Handler mHandler = new Handler();
		private final Runnable mUpdateDisplay = new Runnable() {
		@Override
		public void run() {
			draw();
		}};

		private void draw() {
		   SurfaceHolder holder = getSurfaceHolder();
		   Canvas c = null;
		   try {
		      c = holder.lockCanvas();
		      if (c != null) {
                  //android.os.Debug.waitForDebugger();
                  Calendar ca = Calendar.getInstance();
                  int Hr24x = ca.get(Calendar.HOUR_OF_DAY);
                  int Minx = ca.get(Calendar.MINUTE);
/////////////////////////////////////////Time Text Format - HOUR ///////////////////////////////////////////////////////////
                  String Hr24 = null;
                  if (Hr24x == 0) {
                      Hr24 = "เที่ยงคืน";

                  }
                  if (Hr24x == 1) {
                      Hr24 = "ตีหนึ่ง";

                  }
                  if (Hr24x == 2) {
                      Hr24 = "ตีสอง";

                  }
                  if (Hr24x == 3) {
                      Hr24 = "ตีสาม";

                  }
                  if (Hr24x == 4) {
                      Hr24 = "ตีสี่";

                  }
                  if (Hr24x == 5) {
                      Hr24 = "ตีห้า";

                  }
                  if (Hr24x == 6) {
                      Hr24 = "หกโมง";

                  }
                  if (Hr24x == 7) {
                      Hr24 = "เจ็ดโมง";

                  }
                  if (Hr24x == 8) {
                      Hr24 = "แปดโมง";

                  }
                  if (Hr24x == 9) {
                      Hr24 = "เก้าโมง";

                  }
                  if (Hr24x == 10) {
                      Hr24 = "สิบโมง";

                  }
                  if (Hr24x == 11) {
                      Hr24 = "สิบเอ็ดโมง";

                  }
                  if (Hr24x == 12) {
                      Hr24 = "เที่ยง";

                  }
                  if (Hr24x == 13) {
                      Hr24 = "บ่ายโมง";

                  }
                  if (Hr24x == 14) {
                      Hr24 = "สองโมง";

                  }
                  if (Hr24x == 15) {
                      Hr24 = "สามโมง";

                  }
                  if (Hr24x == 16) {
                      Hr24 = "สี่โมง";

                  }
                  if (Hr24x == 17) {
                      Hr24 = "ห้าโมง";

                  }
                  if (Hr24x == 18) {
                      Hr24 = "หกโมง";

                  }
                  if (Hr24x == 19) {
                      Hr24 = "หนึ่งทุ่ม";

                  }
                  if (Hr24x == 20) {
                      Hr24 = "สองทุ่ม";

                  }
                  if (Hr24x == 21) {
                      Hr24 = "สามทุ่ม";

                  }
                  if (Hr24x == 22) {
                      Hr24 = "สี่ทุ่ม";

                  }
                  if (Hr24x == 23) {
                      Hr24 = "ห้าทุ่ม";

                  }
                  if (Hr24x == 24) {
                      Hr24 = "เที่ยงคืน";

                  }
/////////////////////////////////////End Time Text Format - HOUR/////////////////////////////////////////////////////////////////////////


////////////////////////////////////Time Text Format - MINUTE////////////////////////////////////////////////////////////////////////

                  String Min = null;
                  if (Minx == 0) {
                      Min = "";

                  }
                  if (Minx == 1) {
                      Min = "หนึ่งนาที";

                  }
                  if (Minx == 2) {
                      Min = "สองนาที";

                  }
                  if (Minx == 3) {
                      Min = "สามนาที";

                  }
                  if (Minx == 4) {
                      Min = "สี่นาที";

                  }
                  if (Minx == 5) {
                      Min = "ห้านาที";

                  }
                  if (Minx == 6) {
                      Min = "หกนาที";

                  }
                  if (Minx == 7) {
                      Min = "เจ็ดนาที";

                  }
                  if (Minx == 8) {
                      Min = "แปดนาที";

                  }
                  if (Minx == 9) {
                      Min = "เก้านาที";

                  }
                  if (Minx == 10) {
                      Min = "สิบนาที";

                  }
                  if (Minx == 11) {
                      Min = "สิบเอ็ดนาที";

                  }
                  if (Minx == 12) {
                      Min = "สิบสองนาที";

                  }
                  if (Minx == 13) {
                      Min = "สิบสามนาที";

                  }
                  if (Minx == 14) {
                      Min = "สิบสี่นาที";

                  }
                  if (Minx == 15) {
                      Min = "สิบห้านาที";

                  }
                  if (Minx == 16) {
                      Min = "สิบหกนาที";

                  }
                  if (Minx == 17) {
                      Min = "สิบเจ็ดนาที";

                  }
                  if (Minx == 18) {
                      Min = "สิบแปดนาที";

                  }
                  if (Minx == 19) {
                      Min = "สิบเก้านาที";

                  }
                  if (Minx == 20) {
                      Min = "ยี่สิบนาที";

                  }
                  if (Minx == 21) {
                      Min = "ยี่สิบเอ็ดนาที";

                  }
                  if (Minx == 22) {
                      Min = "ยี่สิบสองนาที";

                  }
                  if (Minx == 23) {
                      Min = "ยี่สิบสามนาที";

                  }
                  if (Minx == 24) {
                      Min = "ยี่สิบสี่นาที";

                  }
                  if (Minx == 25) {
                      Min = "ยี่สิบห้านาที";

                  }
                  if (Minx == 26) {
                      Min = "ยี่สิบหกนาที";

                  }
                  if (Minx == 27) {
                      Min = "ยี่สิบเจ็ดนาที";

                  }
                  if (Minx == 28) {
                      Min = "ยี่สิบแปดนาที";

                  }
                  if (Minx == 29) {
                      Min = "ยี่สิบเก้านาที";

                  }
                  if (Minx == 30) {
                      Min = "สามสิบนาที";

                  }
                  if (Minx == 31) {
                      Min = "สามสิบเอ็ดนาที";

                  }
                  if (Minx == 32) {
                      Min = "สามสิบสองนาที";

                  }
                  if (Minx == 33) {
                      Min = "สามสิบสามนาที";

                  }
                  if (Minx == 34) {
                      Min = "สามสิบสี่นาที";

                  }
                  if (Minx == 35) {
                      Min = "สามสิบห้านาที";

                  }
                  if (Minx == 36) {
                      Min = "สามสิบหกนาที";

                  }
                  if (Minx == 37) {
                      Min = "สามสิบเจ็ดนาที";

                  }
                  if (Minx == 38) {
                      Min = "สามสิบแปดนาที";

                  }
                  if (Minx == 39) {
                      Min = "สามสิบเก้านาที";

                  }
                  if (Minx == 40) {
                      Min = "สี่สิบนาที";

                  }
                  if (Minx == 41) {
                      Min = "สี่สิบเอ็ดนาที";

                  }
                  if (Minx == 42) {
                      Min = "สี่สิบสองนาที";

                  }
                  if (Minx == 43) {
                      Min = "สี่สิบสามนาที";

                  }
                  if (Minx == 44) {
                      Min = "สี่สิบสี่นาที";

                  }
                  if (Minx == 45) {
                      Min = "สี่สิบห้านาที";

                  }
                  if (Minx == 46) {
                      Min = "สี่สิบหกนาที";

                  }
                  if (Minx == 47) {
                      Min = "สี่สิบเจ็ดนาที";

                  }
                  if (Minx == 48) {
                      Min = "สี่สิบแปดนาที";

                  }
                  if (Minx == 49) {
                      Min = "สี่สิบเก้านาที";

                  }
                  if (Minx == 50) {
                      Min = "ห้าสิบนาที";

                  }
                  if (Minx == 51) {
                      Min = "ห้าสิบเอ็ดนาที";

                  }
                  if (Minx == 52) {
                      Min = "ห้าสิบสองนาที";

                  }
                  if (Minx == 53) {
                      Min = "ห้าสิบสามนาที";

                  }
                  if (Minx == 54) {
                      Min = "ห้าสิบสี่นาที";

                  }
                  if (Minx == 55) {
                      Min = "ห้าสิบห้านาที";

                  }
                  if (Minx == 56) {
                      Min = "ห้าสิบหกนาที";

                  }
                  if (Minx == 57) {
                      Min = "ห้าสิบเจ็ดนาที";

                  }
                  if (Minx == 58) {
                      Min = "ห้าสิบแปดนาที";

                  }
                  if (Minx == 59) {
                      Min = "ห้าสิบเก้านาที";

                  }








//////////////////////////////////End Time Text Format - MINUTE////////////////////////////////////////////////////////////////////////


                  Paint p = new Paint();

                  p.setTextSize(70);
                  p.setAntiAlias(true);

                  String HrText = Hr24;
                  String MinText = Min;

                  float w = p.measureText(HrText, 0, HrText.length());
                  float a = p.measureText(MinText, 0, MinText.length());
                  int offset = (int) w / 2;

                  int x = c.getWidth() / 3 - offset;
                  int y = c.getHeight() / 3;
                  int y2 = c.getHeight() / 2;
                  p.setColor(Color.BLACK);
                  c.drawRect(0, 0, c.getWidth(), c.getHeight(), p);
                  p.setColor(Color.WHITE);
                  c.drawText(HrText, x, y, p);
                  c.drawText(MinText, x, y2, p);
              }
		   } finally {
		      if (c != null)
		         holder.unlockCanvasAndPost(c);
		   }
		   mHandler.removeCallbacks(mUpdateDisplay);
	       if (mVisible) {
	           mHandler.postDelayed(mUpdateDisplay, 100);
	       }
		}

		@Override
		public void onVisibilityChanged(boolean visible) {
			mVisible = visible;
			if (visible) {
				draw();
			} else {
				mHandler.removeCallbacks(mUpdateDisplay);
			}
		}
		
		 @Override
	      public void onSurfaceChanged(SurfaceHolder holder, int format, int width, int height) {
	         draw();
	      }
		
		@Override
		public void onSurfaceDestroyed(SurfaceHolder holder) {
			super.onSurfaceDestroyed(holder);
			mVisible = false;
			mHandler.removeCallbacks(mUpdateDisplay);
		}
		
		@Override
	    public void onDestroy() {
	         super.onDestroy();
	         mVisible = false;
	         mHandler.removeCallbacks(mUpdateDisplay);
	    }
	}    
}
