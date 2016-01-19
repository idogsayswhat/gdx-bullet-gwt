package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.collision.btBroadphaseInterface;
import com.badlogic.gdx.physics.bullet.collision.btDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class btSoftBodyWorldInfo extends BulletBase
{
	public btSoftBodyWorldInfo()
	{
		jsObject = createObj();
	}

	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btSoftBodyWorldInfo();
		obj.javaObject = this;
		return obj;
	}-*/;

	
	public native void setBroadphase(btBroadphaseInterface value) /*-{
		var wInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bInterfaceJS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wInfoJS.set_m_broadphase(bInterfaceJS);
	}-*/;

	public native void setDispatcher(btDispatcher value) /*-{
		var wInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var dispatchJS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wInfoJS.set_m_dispatcher(dispatchJS);
	}-*/;

	public btSparseSdf3 getSparsesdf()
	{
		//return (cPtr == 0) ? null : new btSparseSdf3(cPtr, false);
		return new btSparseSdf3();
	}
}
