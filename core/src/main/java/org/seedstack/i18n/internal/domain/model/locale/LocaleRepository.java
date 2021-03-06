/**
 * Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.i18n.internal.domain.model.locale;

import org.seedstack.business.domain.GenericRepository;

import java.util.List;

/**
 * Store application locales.
 *
 * @author pierre.thirouin@ext.mpsa.com
 *         Date: 20/11/13
 */
public interface LocaleRepository extends GenericRepository<Locale, String> {

    /**
     * @return all locales
     */
    List<Locale> loadAll();

    /**
     * Get the number of available locale.
     *
     * @return locale count
     */
    Long count();

    /**
     * @return default locale
     */
    Locale getDefaultLocale();

    /**
     * Changes the default locale.
     *
     * @param locale new default locale
     */
    void changeDefaultLocaleTo(String locale);

    /**
     * Saves all given locales
     *
     * @param entity locales
     */
    void persistAll(List<Locale> entity);

    /**
     * Deletes all locales.
     */
    void clear();
}
