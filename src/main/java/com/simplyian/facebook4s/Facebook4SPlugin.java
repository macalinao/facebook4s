/*
 * This file is part of Facebook4S.
 *
 * Copyright (c) 2012-2012, Ian Macalinao <http://simplyian.com/>
 * Facebook4S is licensed under the Affero General Public License Version 3.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.simplyian.facebook4s;

import java.util.logging.Level;
import org.spout.api.plugin.CommonPlugin;

/**
 * The Facebook4S main plugin class.
 */
public class Facebook4SPlugin extends CommonPlugin {
    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "Plugin disabled!");
    }
}
